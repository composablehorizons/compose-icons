package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Speaker_notes: ImageVector
    get() {
        if (_Speaker_notes != null) return _Speaker_notes!!
        
        _Speaker_notes = ImageVector.Builder(
            name = "speaker_notes",
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
                moveTo(22f, 2f)
                horizontalLineTo(2.01f)
                lineTo(2f, 22f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(16f)
                verticalLineTo(2f)
                close()
                moveTo(8f, 14f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(7f, 6f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(3f, -3f)
                horizontalLineToRelative(-8f)
                verticalLineTo(9f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineToRelative(-8f)
                verticalLineTo(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Speaker_notes!!
    }

private var _Speaker_notes: ImageVector? = null

