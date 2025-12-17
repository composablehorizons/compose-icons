package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Record_voice_over: ImageVector
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
                verticalLineTo(0f)
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
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.66f, -5.33f, -4f, -8f, -4f)
                close()
                moveToRelative(6.47f, -7.23f)
                curveToRelative(0.32f, 0.79f, 0.32f, 1.67f, 0f, 2.46f)
                curveToRelative(-0.19f, 0.47f, -0.11f, 1f, 0.25f, 1.36f)
                lineToRelative(0.03f, 0.03f)
                curveToRelative(0.58f, 0.58f, 1.57f, 0.46f, 1.95f, -0.27f)
                curveToRelative(0.76f, -1.45f, 0.76f, -3.15f, -0.02f, -4.66f)
                curveToRelative(-0.38f, -0.74f, -1.38f, -0.88f, -1.97f, -0.29f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(-0.34f, 0.35f, -0.42f, 0.89f, -0.23f, 1.36f)
                close()
                moveToRelative(3.71f, -4.88f)
                curveToRelative(-0.4f, 0.4f, -0.46f, 1.02f, -0.13f, 1.48f)
                curveToRelative(1.97f, 2.74f, 1.96f, 6.41f, -0.03f, 9.25f)
                curveToRelative(-0.32f, 0.45f, -0.25f, 1.07f, 0.14f, 1.46f)
                lineToRelative(0.03f, 0.03f)
                curveToRelative(0.49f, 0.49f, 1.32f, 0.45f, 1.74f, -0.1f)
                curveToRelative(2.75f, -3.54f, 2.76f, -8.37f, 0f, -12.02f)
                curveToRelative(-0.42f, -0.55f, -1.26f, -0.59f, -1.75f, -0.1f)
                close()
            }
        }.build()
        
        return _Record_voice_over!!
    }

private var _Record_voice_over: ImageVector? = null

