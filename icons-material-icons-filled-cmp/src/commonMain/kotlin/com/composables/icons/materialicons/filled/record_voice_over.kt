package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Record_voice_over: ImageVector
    get() {
        if (_Record_voice_over != null) return _Record_voice_over!!
        
        _Record_voice_over = ImageVector.Builder(
            name = "record_voice_over",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 9f)
                arcTo(4f, 4f, 0f, false, true, 9f, 13f)
                arcTo(4f, 4f, 0f, false, true, 5f, 9f)
                arcTo(4f, 4f, 0f, false, true, 13f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 15f)
                curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.66f, -5.33f, -4f, -8f, -4f)
                close()
                moveToRelative(7.76f, -9.64f)
                lineToRelative(-1.68f, 1.69f)
                curveToRelative(0.84f, 1.18f, 0.84f, 2.71f, 0f, 3.89f)
                lineToRelative(1.68f, 1.69f)
                curveToRelative(2.02f, -2.02f, 2.02f, -5.07f, 0f, -7.27f)
                close()
                moveTo(20.07f, 2f)
                lineToRelative(-1.63f, 1.63f)
                curveToRelative(2.77f, 3.02f, 2.77f, 7.56f, 0f, 10.74f)
                lineTo(20.07f, 16f)
                curveToRelative(3.9f, -3.89f, 3.91f, -9.95f, 0f, -14f)
                close()
            }
        }.build()
        
        return _Record_voice_over!!
    }

private var _Record_voice_over: ImageVector? = null

