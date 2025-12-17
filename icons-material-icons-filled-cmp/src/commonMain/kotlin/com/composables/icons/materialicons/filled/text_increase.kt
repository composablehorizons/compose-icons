package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Text_increase: ImageVector
    get() {
        if (_Text_increase != null) return _Text_increase!!
        
        _Text_increase = ImageVector.Builder(
            name = "text_increase",
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
                moveTo(0.99f, 19f)
                horizontalLineToRelative(2.42f)
                lineToRelative(1.27f, -3.58f)
                horizontalLineToRelative(5.65f)
                lineTo(11.59f, 19f)
                horizontalLineToRelative(2.42f)
                lineTo(8.75f, 5f)
                horizontalLineToRelative(-2.5f)
                lineTo(0.99f, 19f)
                close()
                moveTo(5.41f, 13.39f)
                lineTo(7.44f, 7.6f)
                horizontalLineToRelative(0.12f)
                lineToRelative(2.03f, 5.79f)
                horizontalLineTo(5.41f)
                close()
                moveTo(20f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineTo(11f)
                close()
            }
        }.build()
        
        return _Text_increase!!
    }

private var _Text_increase: ImageVector? = null

