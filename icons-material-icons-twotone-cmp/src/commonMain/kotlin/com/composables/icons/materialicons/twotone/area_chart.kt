package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Area_chart: ImageVector
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
                moveTo(19f, 16.95f)
                lineTo(12f, 11.5f)
                lineTo(8f, 17f)
                lineTo(5f, 14.6f)
                lineTo(5f, 11f)
                lineTo(7.44f, 12.83f)
                lineTo(12.4f, 5.88f)
                lineTo(16.3f, 9f)
                lineTo(19f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 7f)
                lineToRelative(-5f, -4f)
                lineToRelative(-5f, 7f)
                lineTo(3f, 7f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(18f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                close()
                moveTo(19f, 16.95f)
                lineToRelative(-7f, -5.45f)
                lineTo(8f, 17f)
                lineToRelative(-3f, -2.4f)
                verticalLineTo(11f)
                lineToRelative(2.44f, 1.83f)
                lineToRelative(4.96f, -6.95f)
                lineTo(16.3f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(16.95f)
                close()
            }
        }.build()
        
        return _Area_chart!!
    }

private var _Area_chart: ImageVector? = null

