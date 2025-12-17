package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Report_problem: ImageVector
    get() {
        if (_Report_problem != null) return _Report_problem!!
        
        _Report_problem = ImageVector.Builder(
            name = "report_problem",
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
                moveTo(2.73f, 21f)
                horizontalLineToRelative(18.53f)
                curveToRelative(0.77f, 0f, 1.25f, -0.83f, 0.87f, -1.5f)
                lineToRelative(-9.27f, -16f)
                curveToRelative(-0.39f, -0.67f, -1.35f, -0.67f, -1.73f, 0f)
                lineToRelative(-9.27f, 16f)
                curveToRelative(-0.38f, 0.67f, 0.1f, 1.5f, 0.87f, 1.5f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-1f, -4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.build()
        
        return _Report_problem!!
    }

private var _Report_problem: ImageVector? = null

