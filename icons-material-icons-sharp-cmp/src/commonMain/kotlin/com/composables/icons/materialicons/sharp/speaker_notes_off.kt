package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Speaker_notes_off: ImageVector
    get() {
        if (_Speaker_notes_off != null) return _Speaker_notes_off!!
        
        _Speaker_notes_off = ImageVector.Builder(
            name = "speaker_notes_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.27f, 1.73f)
                lineTo(0f, 3f)
                lineToRelative(2.01f, 2.01f)
                lineTo(2f, 22f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(9f)
                lineToRelative(5.73f, 5.73f)
                lineTo(22f, 22.46f)
                lineTo(1.27f, 1.73f)
                close()
                moveTo(8f, 14f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-2f, -3f)
                verticalLineTo(9f)
                lineToRelative(2f, 2f)
                horizontalLineTo(6f)
                close()
                moveToRelative(16f, -9f)
                horizontalLineTo(4.08f)
                lineTo(10f, 7.92f)
                verticalLineTo(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7.92f)
                lineToRelative(1f, 1f)
                horizontalLineTo(18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.92f)
                lineToRelative(6.99f, 6.99f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                close()
            }
        }.build()
        
        return _Speaker_notes_off!!
    }

private var _Speaker_notes_off: ImageVector? = null

