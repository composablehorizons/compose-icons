package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Private_connectivity: ImageVector
    get() {
        if (_Private_connectivity != null) return _Private_connectivity!!
        
        _Private_connectivity = ImageVector.Builder(
            name = "private_connectivity",
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
                moveTo(22f, 12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.07f)
                curveToRelative(-0.49f, -3.39f, -3.4f, -6f, -6.93f, -6f)
                reflectiveCurveToRelative(-6.44f, 2.61f, -6.93f, 6f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.07f)
                curveToRelative(0.49f, 3.39f, 3.4f, 6f, 6.93f, 6f)
                reflectiveCurveToRelative(6.44f, -2.61f, 6.93f, -6f)
                horizontalLineTo(21f)
                curveTo(21.55f, 13f, 22f, 12.55f, 22f, 12f)
                close()
                moveTo(15f, 14.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.21f, 1.08f, -2.18f, 2.34f, -1.97f)
                curveTo(13.32f, 7.69f, 14f, 8.61f, 14f, 9.61f)
                verticalLineToRelative(0.89f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineTo(14.5f)
                close()
                moveTo(12.75f, 13f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveTo(12.75f, 12.59f, 12.75f, 13f)
                close()
                moveTo(13f, 9.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveTo(13f, 8.95f, 13f, 9.5f)
                close()
            }
        }.build()
        
        return _Private_connectivity!!
    }

private var _Private_connectivity: ImageVector? = null

