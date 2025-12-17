package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Cake: ImageVector
    get() {
        if (_Cake != null) return _Cake!!
        
        _Cake = ImageVector.Builder(
            name = "cake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 1.784f)
                lineToRelative(-0.796f, 0.795f)
                arcToRelative(1.125f, 1.125f, 0f, true, false, 1.591f, 0f)
                lineTo(15f, 1.784f)
                close()
                moveTo(12f, 1.784f)
                lineToRelative(-0.796f, 0.795f)
                arcToRelative(1.125f, 1.125f, 0f, true, false, 1.591f, 0f)
                lineTo(12f, 1.784f)
                close()
                moveTo(9f, 1.784f)
                lineToRelative(-0.796f, 0.795f)
                arcToRelative(1.125f, 1.125f, 0f, true, false, 1.591f, 0f)
                lineTo(9f, 1.784f)
                close()
                moveTo(9.75f, 7.547f)
                curveToRelative(0.498f, -0.021f, 0.998f, -0.035f, 1.5f, -0.042f)
                verticalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(0.755f)
                curveToRelative(0.502f, 0.007f, 1.002f, 0.021f, 1.5f, 0.042f)
                verticalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(0.88f)
                lineToRelative(0.307f, 0.022f)
                curveToRelative(1.55f, 0.117f, 2.693f, 1.427f, 2.693f, 2.946f)
                verticalLineToRelative(1.018f)
                arcToRelative(62.182f, 62.182f, 0f, false, false, -13.5f, 0f)
                verticalLineToRelative(-1.018f)
                curveToRelative(0f, -1.519f, 1.143f, -2.829f, 2.693f, -2.946f)
                lineToRelative(0.307f, -0.022f)
                verticalLineToRelative(-0.88f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(0.797f)
                close()
                moveTo(12f, 12.75f)
                curveToRelative(-2.472f, 0f, -4.9f, 0.184f, -7.274f, 0.54f)
                curveToRelative(-1.454f, 0.217f, -2.476f, 1.482f, -2.476f, 2.916f)
                verticalLineToRelative(0.384f)
                arcToRelative(4.104f, 4.104f, 0f, false, true, 2.585f, 0.364f)
                arcToRelative(2.605f, 2.605f, 0f, false, false, 2.33f, 0f)
                arcToRelative(4.104f, 4.104f, 0f, false, true, 3.67f, 0f)
                arcToRelative(2.605f, 2.605f, 0f, false, false, 2.33f, 0f)
                arcToRelative(4.104f, 4.104f, 0f, false, true, 3.67f, 0f)
                arcToRelative(2.605f, 2.605f, 0f, false, false, 2.33f, 0f)
                arcToRelative(4.104f, 4.104f, 0f, false, true, 2.585f, -0.364f)
                verticalLineToRelative(-0.384f)
                curveToRelative(0f, -1.434f, -1.022f, -2.7f, -2.476f, -2.917f)
                arcTo(49.138f, 49.138f, 0f, false, false, 12f, 12.75f)
                close()
                moveTo(21.75f, 18.131f)
                arcToRelative(2.604f, 2.604f, 0f, false, false, -1.915f, 0.165f)
                arcToRelative(4.104f, 4.104f, 0f, false, true, -3.67f, 0f)
                arcToRelative(2.605f, 2.605f, 0f, false, false, -2.33f, 0f)
                arcToRelative(4.104f, 4.104f, 0f, false, true, -3.67f, 0f)
                arcToRelative(2.605f, 2.605f, 0f, false, false, -2.33f, 0f)
                arcToRelative(4.104f, 4.104f, 0f, false, true, -3.67f, 0f)
                arcToRelative(2.604f, 2.604f, 0f, false, false, -1.915f, -0.165f)
                verticalLineToRelative(2.494f)
                curveToRelative(0f, 1.035f, 0.84f, 1.875f, 1.875f, 1.875f)
                horizontalLineToRelative(15.75f)
                curveToRelative(1.035f, 0f, 1.875f, -0.84f, 1.875f, -1.875f)
                verticalLineToRelative(-2.494f)
                close()
            }
        }.build()
        
        return _Cake!!
    }

private var _Cake: ImageVector? = null

