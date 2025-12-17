package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Area_chart: ImageVector
    get() {
        if (_Area_chart != null) return _Area_chart!!
        
        _Area_chart = ImageVector.Builder(
            name = "area_chart",
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
                moveTo(3f, 13f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-9f, -7f)
                lineTo(8f, 17f)
                lineTo(3f, 13f)
                close()
                moveTo(3f, 7f)
                lineToRelative(4f, 3f)
                lineToRelative(5f, -7f)
                lineToRelative(5f, 4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(8.97f)
                lineToRelative(-9.4f, -7.31f)
                lineToRelative(-3.98f, 5.48f)
                lineTo(3f, 10.44f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _Area_chart!!
    }

private var _Area_chart: ImageVector? = null

