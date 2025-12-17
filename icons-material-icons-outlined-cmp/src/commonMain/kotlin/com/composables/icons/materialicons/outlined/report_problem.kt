package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Report_problem: ImageVector
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
                moveTo(12f, 5.99f)
                lineTo(19.53f, 19f)
                horizontalLineTo(4.47f)
                lineTo(12f, 5.99f)
                moveTo(12f, 2f)
                lineTo(1f, 21f)
                horizontalLineToRelative(22f)
                lineTo(12f, 2f)
                close()
                moveToRelative(1f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _Report_problem!!
    }

private var _Report_problem: ImageVector? = null

