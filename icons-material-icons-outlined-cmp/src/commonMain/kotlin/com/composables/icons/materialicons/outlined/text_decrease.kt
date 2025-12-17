package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Text_decrease: ImageVector
    get() {
        if (_Text_decrease != null) return _Text_decrease!!
        
        _Text_decrease = ImageVector.Builder(
            name = "text_decrease",
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
                moveTo(23f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineTo(23f)
                close()
            }
        }.build()
        
        return _Text_decrease!!
    }

private var _Text_decrease: ImageVector? = null

