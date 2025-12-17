package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hdr_off: ImageVector
    get() {
        if (_Hdr_off != null) return _Hdr_off!!
        
        _Hdr_off = ImageVector.Builder(
            name = "hdr_off",
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
                moveTo(17.5f, 14.25f)
                verticalLineTo(13f)
                horizontalLineToRelative(1.1f)
                lineToRelative(0.72f, 1.59f)
                curveToRelative(0.11f, 0.25f, 0.36f, 0.41f, 0.63f, 0.41f)
                curveToRelative(0.5f, 0f, 0.83f, -0.51f, 0.64f, -0.96f)
                lineToRelative(-0.49f, -1.14f)
                curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.9f)
                lineToRelative(1.04f, 1.04f)
                curveToRelative(0.27f, -0.11f, 0.46f, -0.38f, 0.46f, -0.69f)
                close()
                moveToRelative(0f, -3.75f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                close()
                moveToRelative(-4.5f, 0f)
                verticalLineToRelative(0.4f)
                lineToRelative(1.5f, 1.5f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0f, -0.82f, -0.68f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.9f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(0.4f)
                close()
                moveToRelative(8.03f, 10.53f)
                lineToRelative(-18f, -18f)
                curveToRelative(-0.29f, -0.29f, -0.76f, -0.29f, -1.05f, 0f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.76f, 0f, 1.05f)
                lineToRelative(4.98f, 4.98f)
                curveToRelative(-0.27f, 0.11f, -0.46f, 0.38f, -0.46f, 0.69f)
                verticalLineTo(11f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9.75f)
                curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                reflectiveCurveTo(3f, 9.34f, 3f, 9.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(12.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.75f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(10.1f)
                lineToRelative(1.5f, 1.5f)
                verticalLineToRelative(2.9f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.12f, 0f, 0.24f, -0.01f, 0.36f, -0.04f)
                lineToRelative(7.11f, 7.11f)
                curveToRelative(0.29f, 0.29f, 0.76f, 0.29f, 1.05f, 0f)
                curveToRelative(0.29f, -0.28f, 0.29f, -0.75f, 0.01f, -1.04f)
                close()
            }
        }.build()
        
        return _Hdr_off!!
    }

private var _Hdr_off: ImageVector? = null

