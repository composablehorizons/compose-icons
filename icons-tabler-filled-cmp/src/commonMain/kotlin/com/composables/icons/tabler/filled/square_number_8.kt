package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareNumber8: ImageVector
    get() {
        if (_SquareNumber8 != null) return _SquareNumber8!!
        
        _SquareNumber8 = ImageVector.Builder(
            name = "square-number-8",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.333f, 2f)
                curveToRelative(1.96f, 0f, 3.56f, 1.537f, 3.662f, 3.472f)
                lineToRelative(0.005f, 0.195f)
                verticalLineToRelative(12.666f)
                curveToRelative(0f, 1.96f, -1.537f, 3.56f, -3.472f, 3.662f)
                lineToRelative(-0.195f, 0.005f)
                horizontalLineToRelative(-12.666f)
                arcToRelative(3.667f, 3.667f, 0f, false, true, -3.662f, -3.472f)
                lineToRelative(-0.005f, -0.195f)
                verticalLineToRelative(-12.666f)
                curveToRelative(0f, -1.96f, 1.537f, -3.56f, 3.472f, -3.662f)
                lineToRelative(0.195f, -0.005f)
                horizontalLineToRelative(12.666f)
                close()
                moveToRelative(-5.333f, 5f)
                horizontalLineToRelative(-2f)
                lineToRelative(-0.15f, 0.005f)
                arcToRelative(2f, 2f, 0f, false, false, -1.844f, 1.838f)
                lineToRelative(-0.006f, 0.157f)
                verticalLineToRelative(2f)
                lineToRelative(0.005f, 0.15f)
                curveToRelative(0.018f, 0.236f, 0.077f, 0.46f, 0.17f, 0.667f)
                lineToRelative(0.075f, 0.152f)
                lineToRelative(0.018f, 0.03f)
                lineToRelative(-0.018f, 0.032f)
                curveToRelative(-0.133f, 0.24f, -0.218f, 0.509f, -0.243f, 0.795f)
                lineToRelative(-0.007f, 0.174f)
                verticalLineToRelative(2f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, false, false, 1.838f, 1.844f)
                lineToRelative(0.157f, 0.006f)
                horizontalLineToRelative(2f)
                lineToRelative(0.15f, -0.005f)
                arcToRelative(2f, 2f, 0f, false, false, 1.844f, -1.838f)
                lineToRelative(0.006f, -0.157f)
                verticalLineToRelative(-2f)
                lineToRelative(-0.005f, -0.15f)
                arcToRelative(1.988f, 1.988f, 0f, false, false, -0.17f, -0.667f)
                lineToRelative(-0.075f, -0.152f)
                lineToRelative(-0.019f, -0.032f)
                lineToRelative(0.02f, -0.03f)
                arcToRelative(2.01f, 2.01f, 0f, false, false, 0.242f, -0.795f)
                lineToRelative(0.007f, -0.174f)
                verticalLineToRelative(-2f)
                lineToRelative(-0.005f, -0.15f)
                arcToRelative(2f, 2f, 0f, false, false, -1.838f, -1.844f)
                lineToRelative(-0.157f, -0.006f)
                close()
                moveToRelative(0f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(0f, -4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _SquareNumber8!!
    }

private var _SquareNumber8: ImageVector? = null

