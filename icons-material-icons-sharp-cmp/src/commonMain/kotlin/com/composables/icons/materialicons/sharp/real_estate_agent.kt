package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Real_estate_agent: ImageVector
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
                moveTo(14f, 1.5f)
                lineToRelative(-7f, 5f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                lineToRelative(10f, 4f)
                verticalLineToRelative(2f)
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
                moveTo(22f, 19f)
                lineToRelative(-8f, 3f)
                lineToRelative(-7f, -1.98f)
                verticalLineTo(11f)
                horizontalLineToRelative(1.97f)
                lineTo(17f, 14f)
                lineToRelative(0f, 2f)
                horizontalLineToRelative(-4f)
                lineToRelative(-1.76f, -0.68f)
                lineToRelative(-0.33f, 0.94f)
                lineTo(13f, 17f)
                horizontalLineToRelative(9f)
                verticalLineTo(19f)
                close()
            }
        }.build()
        
        return _Real_estate_agent!!
    }

private var _Real_estate_agent: ImageVector? = null

