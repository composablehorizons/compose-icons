package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Report_off: ImageVector
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
                moveTo(11f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.33f)
                lineToRelative(7.2f, 7.2f)
                lineToRelative(0.8f, -0.8f)
                verticalLineTo(8.27f)
                lineTo(15.73f, 3f)
                horizontalLineTo(8.27f)
                lineToRelative(-0.8f, 0.8f)
                lineTo(11f, 7.33f)
                close()
                moveTo(2.41f, 1.58f)
                lineTo(1f, 2.99f)
                lineToRelative(3.64f, 3.64f)
                lineTo(3f, 8.27f)
                verticalLineToRelative(7.46f)
                lineTo(8.27f, 21f)
                horizontalLineToRelative(7.46f)
                lineToRelative(1.64f, -1.64f)
                lineTo(21.01f, 23f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.41f, 1.58f)
                close()
                moveTo(11f, 12.99f)
                lineToRelative(0.01f, 0.01f)
                horizontalLineTo(11f)
                verticalLineToRelative(-0.01f)
                close()
                moveToRelative(1f, 4.31f)
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

