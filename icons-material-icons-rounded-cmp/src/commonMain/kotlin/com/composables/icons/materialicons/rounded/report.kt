package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Report: ImageVector
    get() {
        if (_Report != null) return _Report!!
        
        _Report = ImageVector.Builder(
            name = "report",
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
                moveTo(15.32f, 3f)
                horizontalLineTo(8.68f)
                curveToRelative(-0.26f, 0f, -0.52f, 0.11f, -0.7f, 0.29f)
                lineTo(3.29f, 7.98f)
                curveToRelative(-0.18f, 0.18f, -0.29f, 0.44f, -0.29f, 0.7f)
                verticalLineToRelative(6.63f)
                curveToRelative(0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f)
                lineToRelative(4.68f, 4.68f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.3f, 0.71f, 0.3f)
                horizontalLineToRelative(6.63f)
                curveToRelative(0.27f, 0f, 0.52f, -0.11f, 0.71f, -0.29f)
                lineToRelative(4.68f, -4.68f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                verticalLineTo(8.68f)
                curveToRelative(0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f)
                lineToRelative(-4.68f, -4.68f)
                curveToRelative(-0.18f, -0.18f, -0.44f, -0.29f, -0.7f, -0.29f)
                close()
                moveTo(12f, 17.3f)
                curveToRelative(-0.72f, 0f, -1.3f, -0.58f, -1.3f, -1.3f)
                reflectiveCurveToRelative(0.58f, -1.3f, 1.3f, -1.3f)
                reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f)
                reflectiveCurveToRelative(-0.58f, 1.3f, -1.3f, 1.3f)
                close()
                moveToRelative(0f, -4.3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.build()
        
        return _Report!!
    }

private var _Report: ImageVector? = null

