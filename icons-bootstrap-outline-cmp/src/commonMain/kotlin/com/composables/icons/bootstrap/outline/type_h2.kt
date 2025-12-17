package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TypeH2: ImageVector
    get() {
        if (_TypeH2 != null) return _TypeH2!!
        
        _TypeH2 = ImageVector.Builder(
            name = "type-h2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.495f, 13f)
                verticalLineTo(3.201f)
                horizontalLineTo(6.174f)
                verticalLineToRelative(4.15f)
                horizontalLineTo(1.32f)
                verticalLineTo(3.2f)
                horizontalLineTo(0f)
                verticalLineTo(13f)
                horizontalLineToRelative(1.32f)
                verticalLineTo(8.513f)
                horizontalLineToRelative(4.854f)
                verticalLineTo(13f)
                close()
                moveToRelative(3.174f, -7.071f)
                verticalLineToRelative(-0.05f)
                curveToRelative(0f, -0.934f, 0.66f, -1.752f, 1.801f, -1.752f)
                curveToRelative(1.005f, 0f, 1.76f, 0.639f, 1.76f, 1.651f)
                curveToRelative(0f, 0.898f, -0.582f, 1.58f, -1.12f, 2.19f)
                lineToRelative(-3.69f, 4.2f)
                verticalLineTo(13f)
                horizontalLineToRelative(6.331f)
                verticalLineToRelative(-1.149f)
                horizontalLineToRelative(-4.458f)
                verticalLineToRelative(-0.079f)
                lineTo(13.9f, 8.786f)
                curveToRelative(0.919f, -1.048f, 1.666f, -1.874f, 1.666f, -3.101f)
                curveTo(15.565f, 4.149f, 14.35f, 3f, 12.499f, 3f)
                curveTo(10.46f, 3f, 9.384f, 4.393f, 9.384f, 5.879f)
                verticalLineToRelative(0.05f)
                close()
            }
        }.build()
        
        return _TypeH2!!
    }

private var _TypeH2: ImageVector? = null

