package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Report_off: ImageVector
    get() {
        if (_Report_off != null) return _Report_off!!
        
        _Report_off = ImageVector.Builder(
            name = "report_off",
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
                moveTo(12f, 7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.33f)
                lineToRelative(7.2f, 7.2f)
                lineToRelative(0.51f, -0.51f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                verticalLineTo(8.68f)
                curveToRelative(0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f)
                lineToRelative(-4.68f, -4.68f)
                curveToRelative(-0.19f, -0.18f, -0.45f, -0.29f, -0.71f, -0.29f)
                horizontalLineTo(8.68f)
                curveToRelative(-0.26f, 0f, -0.52f, 0.11f, -0.7f, 0.29f)
                lineToRelative(-0.51f, 0.51f)
                lineToRelative(3.69f, 3.69f)
                curveToRelative(0.17f, -0.29f, 0.48f, -0.49f, 0.84f, -0.49f)
                close()
                moveTo(2.41f, 1.58f)
                lineTo(1f, 2.99f)
                lineToRelative(3.64f, 3.64f)
                lineToRelative(-1.35f, 1.35f)
                curveToRelative(-0.18f, 0.18f, -0.29f, 0.44f, -0.29f, 0.7f)
                verticalLineToRelative(6.63f)
                curveToRelative(0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f)
                lineToRelative(4.68f, 4.68f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.3f, 0.71f, 0.3f)
                horizontalLineToRelative(6.63f)
                curveToRelative(0.27f, 0f, 0.52f, -0.11f, 0.71f, -0.29f)
                lineToRelative(1.35f, -1.35f)
                lineTo(21.01f, 23f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.41f, 1.58f)
                close()
                moveTo(12f, 17.3f)
                curveToRelative(-0.72f, 0f, -1.3f, -0.58f, -1.3f, -1.3f)
                curveToRelative(0f, -0.72f, 0.58f, -1.3f, 1.3f, -1.3f)
                reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f)
                curveToRelative(0f, 0.72f, -0.58f, 1.3f, -1.3f, 1.3f)
                close()
            }
        }.build()
        
        return _Report_off!!
    }

private var _Report_off: ImageVector? = null

