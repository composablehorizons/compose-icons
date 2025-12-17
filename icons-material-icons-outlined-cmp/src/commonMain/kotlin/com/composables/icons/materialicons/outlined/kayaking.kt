package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Kayaking: ImageVector
    get() {
        if (_Kayaking != null) return _Kayaking!!
        
        _Kayaking = ImageVector.Builder(
            name = "kayaking",
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
                moveTo(21f, 23f)
                curveToRelative(-1.03f, 0f, -2.06f, -0.25f, -3f, -0.75f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.89f, 1f, -4.11f, 1f, -6f, 0f)
                curveToRelative(-1.89f, 1f, -4.11f, 1f, -6f, 0f)
                curveTo(5.05f, 22.75f, 4.03f, 23f, 3f, 23f)
                horizontalLineTo(2f)
                lineToRelative(0f, -2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.04f, 0f, 2.08f, -0.35f, 3f, -1f)
                curveToRelative(1.83f, 1.3f, 4.17f, 1.3f, 6f, 0f)
                curveToRelative(1.83f, 1.3f, 4.17f, 1.3f, 6f, 0f)
                curveToRelative(0.91f, 0.65f, 1.96f, 1f, 3f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineTo(21f)
                close()
                moveTo(12f, 5.5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveTo(13.1f, 5.5f, 12f, 5.5f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 0f, -1.52f, 0.71f, -3.93f, 1.37f)
                curveToRelative(-0.82f, -0.23f, -1.53f, -0.75f, -2.07f, -1.37f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.5f, -3f, 1.5f)
                reflectiveCurveToRelative(-2.27f, -0.66f, -3f, -1.5f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.5f, -3f, 1.5f)
                reflectiveCurveToRelative(-2.27f, -0.66f, -3f, -1.5f)
                curveToRelative(-0.54f, 0.61f, -1.25f, 1.13f, -2.07f, 1.37f)
                curveTo(1.52f, 18.21f, 0f, 17.5f, 0f, 17.5f)
                reflectiveCurveToRelative(2.93f, -1.36f, 7.13f, -2.08f)
                lineToRelative(1.35f, -4.17f)
                curveToRelative(0.31f, -0.95f, 1.32f, -1.47f, 2.27f, -1.16f)
                curveToRelative(0.09f, 0.03f, 0.19f, 0.07f, 0.27f, 0.11f)
                lineToRelative(0f, 0f)
                lineToRelative(2.47f, 1.3f)
                lineToRelative(2.84f, -1.5f)
                lineToRelative(1.65f, -3.71f)
                lineToRelative(-0.51f, -1.32f)
                lineTo(18.8f, 2f)
                lineTo(22f, 3.43f)
                lineTo(20.67f, 6.4f)
                lineToRelative(-1.31f, 0.5f)
                lineToRelative(-3.72f, 8.34f)
                curveTo(20.49f, 15.87f, 24f, 17.5f, 24f, 17.5f)
                close()
                moveTo(15.02f, 12.96f)
                lineToRelative(-1.52f, 0.8f)
                lineToRelative(-1.75f, -0.92f)
                lineToRelative(-0.71f, 2.17f)
                curveTo(11.36f, 15.01f, 11.68f, 15f, 12f, 15f)
                curveToRelative(0.71f, 0f, 1.4f, 0.03f, 2.07f, 0.08f)
                lineTo(15.02f, 12.96f)
                close()
            }
        }.build()
        
        return _Kayaking!!
    }

private var _Kayaking: ImageVector? = null

