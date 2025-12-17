package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ArrowsAlt: ImageVector
    get() {
        if (_ArrowsAlt != null) return _ArrowsAlt!!
        
        _ArrowsAlt = ImageVector.Builder(
            name = "arrows-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(352.201f, 425.775f)
                lineToRelative(-79.196f, 79.196f)
                curveToRelative(-9.373f, 9.373f, -24.568f, 9.373f, -33.941f, 0f)
                lineToRelative(-79.196f, -79.196f)
                curveToRelative(-15.119f, -15.119f, -4.411f, -40.971f, 16.971f, -40.97f)
                horizontalLineToRelative(51.162f)
                lineTo(228f, 284f)
                horizontalLineTo(127.196f)
                verticalLineToRelative(51.162f)
                curveToRelative(0f, 21.382f, -25.851f, 32.09f, -40.971f, 16.971f)
                lineTo(7.029f, 272.937f)
                curveToRelative(-9.373f, -9.373f, -9.373f, -24.569f, 0f, -33.941f)
                lineTo(86.225f, 159.8f)
                curveToRelative(15.119f, -15.119f, 40.971f, -4.411f, 40.971f, 16.971f)
                verticalLineTo(228f)
                horizontalLineTo(228f)
                verticalLineTo(127.196f)
                horizontalLineToRelative(-51.23f)
                curveToRelative(-21.382f, 0f, -32.09f, -25.851f, -16.971f, -40.971f)
                lineToRelative(79.196f, -79.196f)
                curveToRelative(9.373f, -9.373f, 24.568f, -9.373f, 33.941f, 0f)
                lineToRelative(79.196f, 79.196f)
                curveToRelative(15.119f, 15.119f, 4.411f, 40.971f, -16.971f, 40.971f)
                horizontalLineToRelative(-51.162f)
                verticalLineTo(228f)
                horizontalLineToRelative(100.804f)
                verticalLineToRelative(-51.162f)
                curveToRelative(0f, -21.382f, 25.851f, -32.09f, 40.97f, -16.971f)
                lineToRelative(79.196f, 79.196f)
                curveToRelative(9.373f, 9.373f, 9.373f, 24.569f, 0f, 33.941f)
                lineTo(425.773f, 352.2f)
                curveToRelative(-15.119f, 15.119f, -40.971f, 4.411f, -40.97f, -16.971f)
                verticalLineTo(284f)
                horizontalLineTo(284f)
                verticalLineToRelative(100.804f)
                horizontalLineToRelative(51.23f)
                curveToRelative(21.382f, 0f, 32.09f, 25.851f, 16.971f, 40.971f)
                close()
            }
        }.build()
        
        return _ArrowsAlt!!
    }

private var _ArrowsAlt: ImageVector? = null

