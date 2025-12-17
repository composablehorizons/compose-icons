package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Start: ImageVector
    get() {
        if (_Start != null) return _Start!!
        
        _Start = ImageVector.Builder(
            name = "start",
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
                moveTo(15.29f, 17.29f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(4.59f, -4.59f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(16.7f, 6.7f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.38f, 0.39f, -0.39f, 1.03f, 0f, 1.42f)
                lineTo(18.17f, 11f)
                horizontalLineTo(7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11.17f)
                lineToRelative(-2.88f, 2.88f)
                curveTo(14.9f, 16.27f, 14.9f, 16.9f, 15.29f, 17.29f)
                close()
                moveTo(3f, 18f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(2f, 6.45f, 2f, 7f)
                verticalLineToRelative(10f)
                curveTo(2f, 17.55f, 2.45f, 18f, 3f, 18f)
                close()
            }
        }.build()
        
        return _Start!!
    }

private var _Start: ImageVector? = null

