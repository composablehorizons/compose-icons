package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Speaker_notes_off: ImageVector
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
                moveTo(6f, 11f)
                verticalLineTo(9f)
                lineTo(4f, 7f)
                verticalLineToRelative(10.17f)
                lineTo(5.17f, 16f)
                horizontalLineTo(13f)
                lineToRelative(-5f, -5f)
                horizontalLineTo(6f)
                close()
                moveToRelative(2f, 3f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 4f)
                horizontalLineTo(6.66f)
                lineTo(10f, 7.34f)
                verticalLineTo(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7.34f)
                lineToRelative(1f, 1f)
                horizontalLineTo(18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.34f)
                lineToRelative(5f, 5f)
                horizontalLineTo(20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-1.34f)
                lineToRelative(1.91f, 1.91f)
                curveTo(21.39f, 17.66f, 22f, 16.9f, 22f, 16f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4.66f)
                lineToRelative(2f, 2f)
                horizontalLineTo(20f)
                close()
                moveTo(6f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                close()
                moveToRelative(12f, -1f)
                verticalLineTo(9f)
                horizontalLineToRelative(-6.34f)
                lineToRelative(2f, 2f)
                close()
                moveToRelative(0f, -3f)
                verticalLineTo(6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(1.34f)
                lineToRelative(0.66f, 0.66f)
                close()
                moveTo(1.41f, 1.59f)
                lineTo(0f, 3f)
                lineToRelative(2f, 2.01f)
                verticalLineTo(22f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(9f)
                lineToRelative(5.73f, 5.73f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.41f, 1.59f)
                close()
                moveTo(5.17f, 16f)
                lineTo(4f, 17.17f)
                verticalLineTo(7f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineToRelative(5f, 5f)
                horizontalLineTo(5.17f)
                close()
            }
        }.build()
        
        return _Speaker_notes_off!!
    }

private var _Speaker_notes_off: ImageVector? = null

