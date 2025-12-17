package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Exposure: ImageVector
    get() {
        if (_Exposure != null) return _Exposure!!
        
        _Exposure = ImageVector.Builder(
            name = "exposure",
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(6.75f, 7f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveTo(6.34f, 7f, 6.75f, 7f)
                close()
                moveTo(18f, 19f)
                horizontalLineTo(5f)
                lineTo(19f, 5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveToRelative(-3.5f, -3f)
                verticalLineToRelative(1.25f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(16f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                horizontalLineTo(16f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-1.25f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(1.25f)
                close()
            }
        }.build()
        
        return _Exposure!!
    }

private var _Exposure: ImageVector? = null

