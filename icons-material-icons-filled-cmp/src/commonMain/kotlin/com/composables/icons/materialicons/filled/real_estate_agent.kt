package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Real_estate_agent: ImageVector
    get() {
        if (_Real_estate_agent != null) return _Real_estate_agent!!
        
        _Real_estate_agent = ImageVector.Builder(
            name = "real_estate_agent",
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
                moveTo(1f, 22f)
                horizontalLineToRelative(4f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                verticalLineTo(22f)
                close()
                moveTo(20f, 17f)
                horizontalLineToRelative(-7f)
                lineToRelative(-2.09f, -0.73f)
                lineToRelative(0.33f, -0.94f)
                lineTo(13f, 16f)
                horizontalLineToRelative(2.82f)
                curveToRelative(0.65f, 0f, 1.18f, -0.53f, 1.18f, -1.18f)
                lineToRelative(0f, 0f)
                curveToRelative(0f, -0.49f, -0.31f, -0.93f, -0.77f, -1.11f)
                lineTo(8.97f, 11f)
                horizontalLineTo(7f)
                verticalLineToRelative(9.02f)
                lineTo(14f, 22f)
                lineToRelative(8f, -3f)
                lineToRelative(0f, 0f)
                curveTo(21.99f, 17.9f, 21.11f, 17f, 20f, 17f)
                close()
                moveTo(14f, 1.5f)
                lineToRelative(-7f, 5f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                lineToRelative(8.14f, 3.26f)
                curveTo(18.26f, 12.71f, 19f, 13.79f, 19f, 15f)
                horizontalLineToRelative(2f)
                verticalLineTo(6.5f)
                lineTo(14f, 1.5f)
                close()
                moveTo(13.5f, 10f)
                horizontalLineToRelative(-1f)
                verticalLineTo(9f)
                horizontalLineToRelative(1f)
                verticalLineTo(10f)
                close()
                moveTo(13.5f, 8f)
                horizontalLineToRelative(-1f)
                verticalLineTo(7f)
                horizontalLineToRelative(1f)
                verticalLineTo(8f)
                close()
                moveTo(15.5f, 10f)
                horizontalLineToRelative(-1f)
                verticalLineTo(9f)
                horizontalLineToRelative(1f)
                verticalLineTo(10f)
                close()
                moveTo(15.5f, 8f)
                horizontalLineToRelative(-1f)
                verticalLineTo(7f)
                horizontalLineToRelative(1f)
                verticalLineTo(8f)
                close()
            }
        }.build()
        
        return _Real_estate_agent!!
    }

private var _Real_estate_agent: ImageVector? = null

