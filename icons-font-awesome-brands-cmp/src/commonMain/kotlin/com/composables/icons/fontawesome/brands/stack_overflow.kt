package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.StackOverflow: ImageVector
    get() {
        if (_StackOverflow != null) return _StackOverflow!!
        
        _StackOverflow = ImageVector.Builder(
            name = "stack-overflow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(290.7f, 311f)
                lineTo(95f, 269.7f)
                lineTo(86.8f, 309f)
                lineToRelative(195.7f, 41f)
                close()
                moveToRelative(51f, -87f)
                lineTo(188.2f, 95.7f)
                lineToRelative(-25.5f, 30.8f)
                lineToRelative(153.5f, 128.3f)
                close()
                moveToRelative(-31.2f, 39.7f)
                lineTo(129.2f, 179f)
                lineToRelative(-16.7f, 36.5f)
                lineTo(293.7f, 300f)
                close()
                moveTo(262f, 32f)
                lineToRelative(-32f, 24f)
                lineToRelative(119.3f, 160.3f)
                lineToRelative(32f, -24f)
                close()
                moveToRelative(20.5f, 328f)
                horizontalLineToRelative(-200f)
                verticalLineToRelative(39.7f)
                horizontalLineToRelative(200f)
                close()
                moveToRelative(39.7f, 80f)
                horizontalLineTo(42.7f)
                verticalLineTo(320f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(359.5f)
                verticalLineTo(320f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _StackOverflow!!
    }

private var _StackOverflow: ImageVector? = null

