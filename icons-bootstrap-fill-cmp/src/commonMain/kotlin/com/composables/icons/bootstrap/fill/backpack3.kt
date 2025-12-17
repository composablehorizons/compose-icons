package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Backpack3: ImageVector
    get() {
        if (_Backpack3 != null) return _Backpack3!!
        
        _Backpack3 = ImageVector.Builder(
            name = "backpack3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 2f)
                verticalLineToRelative(0.341f)
                arcToRelative(6f, 6f, 0f, false, false, -1.308f, 0.653f)
                lineToRelative(-0.416f, -1.247f)
                arcToRelative(1f, 1f, 0f, false, false, -1.749f, -0.284f)
                lineToRelative(-0.77f, 1.027f)
                arcToRelative(1f, 1f, 0f, false, false, -0.149f, 0.917f)
                lineToRelative(0.803f, 2.407f)
                arcTo(6f, 6f, 0f, false, false, 2f, 8f)
                verticalLineToRelative(5.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 4.5f, 16f)
                horizontalLineToRelative(7f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.5f, -2.5f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.771f, -0.146f, -1.509f, -0.41f, -2.186f)
                lineToRelative(0.801f, -2.407f)
                arcToRelative(1f, 1f, 0f, false, false, -0.148f, -0.917f)
                lineToRelative(-0.77f, -1.027f)
                arcToRelative(1f, 1f, 0f, false, false, -1.75f, 0.284f)
                lineToRelative(-0.415f, 1.247f)
                arcTo(6f, 6f, 0f, false, false, 10f, 2.34f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                moveToRelative(1f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                verticalLineToRelative(0.083f)
                arcToRelative(6f, 6f, 0f, false, false, -2f, 0f)
                close()
                moveToRelative(5.941f, 2.595f)
                arcToRelative(6f, 6f, 0f, false, false, -0.8f, -0.937f)
                lineToRelative(0.531f, -1.595f)
                lineToRelative(0.77f, 1.027f)
                close()
                moveTo(3.86f, 3.658f)
                arcToRelative(6f, 6f, 0f, false, false, -0.8f, 0.937f)
                lineTo(2.557f, 3.09f)
                lineToRelative(0.77f, -1.027f)
                close()
                moveToRelative(0.18f, 3.772f)
                arcToRelative(4f, 4f, 0f, false, true, 7.92f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.99f, 0.142f)
                arcToRelative(3f, 3f, 0f, false, false, -5.94f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.99f, -0.142f)
                moveTo(4f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
            }
        }.build()
        
        return _Backpack3!!
    }

private var _Backpack3: ImageVector? = null

