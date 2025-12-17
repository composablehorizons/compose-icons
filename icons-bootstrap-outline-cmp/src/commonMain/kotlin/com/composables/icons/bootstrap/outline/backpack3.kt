package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Backpack3: ImageVector
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
                moveTo(4.04f, 7.43f)
                arcToRelative(4f, 4f, 0f, false, true, 7.92f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.99f, 0.14f)
                arcToRelative(3f, 3f, 0f, false, false, -5.94f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.99f, -0.14f)
                moveTo(4f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
                moveToRelative(1f, 0.5f)
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
                moveTo(6f, 2.341f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                verticalLineToRelative(0.341f)
                curveToRelative(0.465f, 0.165f, 0.904f, 0.385f, 1.308f, 0.653f)
                lineToRelative(0.416f, -1.247f)
                arcToRelative(1f, 1f, 0f, false, true, 1.748f, -0.284f)
                lineToRelative(0.77f, 1.027f)
                arcToRelative(1f, 1f, 0f, false, true, 0.15f, 0.917f)
                lineToRelative(-0.803f, 2.407f)
                curveTo(13.854f, 6.49f, 14f, 7.229f, 14f, 8f)
                verticalLineToRelative(5.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-7f)
                arcTo(2.5f, 2.5f, 0f, false, true, 2f, 13.5f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.771f, 0.146f, -1.509f, 0.41f, -2.186f)
                lineToRelative(-0.802f, -2.407f)
                arcToRelative(1f, 1f, 0f, false, true, 0.15f, -0.917f)
                lineToRelative(0.77f, -1.027f)
                arcToRelative(1f, 1f, 0f, false, true, 1.748f, 0.284f)
                lineToRelative(0.416f, 1.247f)
                arcTo(6f, 6f, 0f, false, true, 6f, 2.34f)
                close()
                moveTo(7f, 2f)
                verticalLineToRelative(0.083f)
                arcToRelative(6f, 6f, 0f, false, true, 2f, 0f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                moveToRelative(5.941f, 2.595f)
                lineToRelative(0.502f, -1.505f)
                lineToRelative(-0.77f, -1.027f)
                lineToRelative(-0.532f, 1.595f)
                quadToRelative(0.447f, 0.427f, 0.8f, 0.937f)
                moveTo(3.86f, 3.658f)
                lineToRelative(-0.532f, -1.595f)
                lineToRelative(-0.77f, 1.027f)
                lineToRelative(0.502f, 1.505f)
                quadToRelative(0.352f, -0.51f, 0.8f, -0.937f)
                moveTo(8f, 3f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, 5f)
                verticalLineToRelative(5.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 15f)
                horizontalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(8f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, -5f)
            }
        }.build()
        
        return _Backpack3!!
    }

private var _Backpack3: ImageVector? = null

