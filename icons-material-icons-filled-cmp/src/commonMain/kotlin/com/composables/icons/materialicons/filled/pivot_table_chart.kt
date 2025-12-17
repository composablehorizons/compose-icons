package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Pivot_table_chart: ImageVector
    get() {
        if (_Pivot_table_chart != null) return _Pivot_table_chart!!
        
        _Pivot_table_chart = ImageVector.Builder(
            name = "pivot_table_chart",
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
                moveTo(10f, 8f)
                horizontalLineToRelative(11f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(5f)
                close()
                moveTo(3f, 8f)
                horizontalLineToRelative(5f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(2f, 13f)
                horizontalLineToRelative(3f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveToRelative(8f, 1f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
                close()
                moveToRelative(1f, -9f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.58f, 19f)
                horizontalLineTo(13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.58f)
                curveToRelative(1.33f, 0f, 2.42f, -1.08f, 2.42f, -2.42f)
                verticalLineTo(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.58f)
                curveToRelative(0f, 2.44f, -1.98f, 4.42f, -4.42f, 4.42f)
                close()
            }
        }.build()
        
        return _Pivot_table_chart!!
    }

private var _Pivot_table_chart: ImageVector? = null

