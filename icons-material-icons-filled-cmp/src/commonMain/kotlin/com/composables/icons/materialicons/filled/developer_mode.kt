package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Developer_mode: ImageVector
    get() {
        if (_Developer_mode != null) return _Developer_mode!!
        
        _Developer_mode = ImageVector.Builder(
            name = "developer_mode",
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
                moveTo(7f, 5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -1.99f, -2f, -1.99f)
                lineTo(7f, 1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                close()
                moveToRelative(8.41f, 11.59f)
                lineTo(20f, 12f)
                lineToRelative(-4.59f, -4.59f)
                lineTo(14f, 8.83f)
                lineTo(17.17f, 12f)
                lineTo(14f, 15.17f)
                lineToRelative(1.41f, 1.42f)
                close()
                moveTo(10f, 15.17f)
                lineTo(6.83f, 12f)
                lineTo(10f, 8.83f)
                lineTo(8.59f, 7.41f)
                lineTo(4f, 12f)
                lineToRelative(4.59f, 4.59f)
                lineTo(10f, 15.17f)
                close()
                moveTo(17f, 19f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Developer_mode!!
    }

private var _Developer_mode: ImageVector? = null

