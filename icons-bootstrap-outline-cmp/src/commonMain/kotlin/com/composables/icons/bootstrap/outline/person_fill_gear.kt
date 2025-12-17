package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonFillGear: ImageVector
    get() {
        if (_PersonFillGear != null) return _PersonFillGear!!
        
        _PersonFillGear = ImageVector.Builder(
            name = "person-fill-gear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 5f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                moveToRelative(-9f, 8f)
                curveToRelative(0f, 1f, 1f, 1f, 1f, 1f)
                horizontalLineToRelative(5.256f)
                arcTo(4.5f, 4.5f, 0f, false, true, 8f, 12.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 1.544f, -3.393f)
                quadTo(8.844f, 9.002f, 8f, 9f)
                curveToRelative(-5f, 0f, -6f, 3f, -6f, 4f)
                moveToRelative(9.886f, -3.54f)
                curveToRelative(0.18f, -0.613f, 1.048f, -0.613f, 1.229f, 0f)
                lineToRelative(0.043f, 0.148f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, 0.921f, 0.382f)
                lineToRelative(0.136f, -0.074f)
                curveToRelative(0.561f, -0.306f, 1.175f, 0.308f, 0.87f, 0.869f)
                lineToRelative(-0.075f, 0.136f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, 0.382f, 0.92f)
                lineToRelative(0.149f, 0.045f)
                curveToRelative(0.612f, 0.18f, 0.612f, 1.048f, 0f, 1.229f)
                lineToRelative(-0.15f, 0.043f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, -0.38f, 0.921f)
                lineToRelative(0.074f, 0.136f)
                curveToRelative(0.305f, 0.561f, -0.309f, 1.175f, -0.87f, 0.87f)
                lineToRelative(-0.136f, -0.075f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, -0.92f, 0.382f)
                lineToRelative(-0.045f, 0.149f)
                curveToRelative(-0.18f, 0.612f, -1.048f, 0.612f, -1.229f, 0f)
                lineToRelative(-0.043f, -0.15f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, -0.921f, -0.38f)
                lineToRelative(-0.136f, 0.074f)
                curveToRelative(-0.561f, 0.305f, -1.175f, -0.309f, -0.87f, -0.87f)
                lineToRelative(0.075f, -0.136f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, -0.382f, -0.92f)
                lineToRelative(-0.148f, -0.045f)
                curveToRelative(-0.613f, -0.18f, -0.613f, -1.048f, 0f, -1.229f)
                lineToRelative(0.148f, -0.043f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, 0.382f, -0.921f)
                lineToRelative(-0.074f, -0.136f)
                curveToRelative(-0.306f, -0.561f, 0.308f, -1.175f, 0.869f, -0.87f)
                lineToRelative(0.136f, 0.075f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, 0.92f, -0.382f)
                close()
                moveTo(14f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
            }
        }.build()
        
        return _PersonFillGear!!
    }

private var _PersonFillGear: ImageVector? = null

