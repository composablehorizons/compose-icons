package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sticky_note_2: ImageVector
    get() {
        if (_Sticky_note_2 != null) return _Sticky_note_2!!
        
        _Sticky_note_2 = ImageVector.Builder(
            name = "sticky_note_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.99f, 3f)
                lineTo(3f, 21f)
                horizontalLineToRelative(12f)
                lineToRelative(6f, -6f)
                verticalLineTo(3f)
                horizontalLineTo(2.99f)
                close()
                moveTo(7f, 8f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                close()
                moveTo(12f, 14f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineTo(14f)
                close()
                moveTo(14f, 19.5f)
                verticalLineTo(14f)
                horizontalLineToRelative(5.5f)
                lineTo(14f, 19.5f)
                close()
            }
        }.build()
        
        return _Sticky_note_2!!
    }

private var _Sticky_note_2: ImageVector? = null

