package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Closed_caption_disabled: ImageVector
    get() {
        if (_Closed_caption_disabled != null) return _Closed_caption_disabled!!
        
        _Closed_caption_disabled = ImageVector.Builder(
            name = "closed_caption_disabled",
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
                moveTo(13f, 10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                lineTo(13f, 10f)
                close()
                moveTo(16.5f, 13.5f)
                lineToRelative(1.21f, 1.21f)
                curveTo(17.89f, 14.52f, 18f, 14.27f, 18f, 14f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(13.5f)
                close()
                moveTo(8.83f, 6f)
                horizontalLineTo(19f)
                verticalLineToRelative(10.17f)
                lineToRelative(1.98f, 1.98f)
                curveToRelative(0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.16f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(6.83f)
                lineTo(8.83f, 6f)
                close()
                moveTo(19.78f, 22.61f)
                lineTo(17.17f, 20f)
                horizontalLineTo(5f)
                curveToRelative(-1.11f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.15f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(7.5f, 13.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(13f)
                horizontalLineToRelative(0.67f)
                lineToRelative(-2.5f, -2.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(13.5f)
                close()
                moveTo(15.17f, 18f)
                lineTo(11f, 13.83f)
                verticalLineTo(14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.32f, 0.16f, -0.59f, 0.4f, -0.78f)
                lineTo(5f, 7.83f)
                verticalLineTo(18f)
                horizontalLineTo(15.17f)
                close()
            }
        }.build()
        
        return _Closed_caption_disabled!!
    }

private var _Closed_caption_disabled: ImageVector? = null

