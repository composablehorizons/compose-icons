package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Holiday_village: ImageVector
    get() {
        if (_Holiday_village != null) return _Holiday_village!!
        
        _Holiday_village = ImageVector.Builder(
            name = "holiday_village",
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
                moveTo(18f, 20f)
                verticalLineTo(8.35f)
                lineTo(13.65f, 4f)
                horizontalLineToRelative(-2.83f)
                lineTo(16f, 9.18f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                close()
                moveTo(22f, 20f)
                verticalLineTo(6.69f)
                lineTo(19.31f, 4f)
                horizontalLineToRelative(-2.83f)
                lineTo(20f, 7.52f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                close()
                moveTo(8f, 4f)
                lineToRelative(-6f, 6f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineTo(10f)
                lineTo(8f, 4f)
                close()
                moveTo(9f, 13f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(13f)
                close()
            }
        }.build()
        
        return _Holiday_village!!
    }

private var _Holiday_village: ImageVector? = null

