package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.H2: ImageVector
    get() {
        if (_H2 != null) return _H2!!
        
        _H2 = ImageVector.Builder(
            name = "h2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.75f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-8.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 1.75f, 3f)
                close()
                moveTo(12.5f, 7.5f)
                curveToRelative(-0.558f, 0f, -1.106f, 0.04f, -1.642f, 0.119f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.216f, -1.484f)
                arcToRelative(12.848f, 12.848f, 0f, false, true, 2.836f, -0.098f)
                arcTo(1.629f, 1.629f, 0f, false, true, 14.99f, 7.58f)
                arcToRelative(8.884f, 8.884f, 0f, false, true, -0.021f, 1.166f)
                curveToRelative(-0.06f, 0.702f, -0.553f, 1.24f, -1.159f, 1.441f)
                lineToRelative(-2.14f, 0.713f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.17f, 0.237f)
                verticalLineToRelative(0.363f)
                horizontalLineToRelative(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-1.113f)
                arcToRelative(1.75f, 1.75f, 0f, false, true, 1.197f, -1.66f)
                lineToRelative(2.139f, -0.713f)
                curveToRelative(0.1f, -0.033f, 0.134f, -0.103f, 0.138f, -0.144f)
                arcToRelative(7.344f, 7.344f, 0f, false, false, 0.018f, -0.97f)
                curveToRelative(-0.003f, -0.052f, -0.046f, -0.111f, -0.128f, -0.117f)
                arcTo(11.417f, 11.417f, 0f, false, false, 12.5f, 7.5f)
                close()
            }
        }.build()
        
        return _H2!!
    }

private var _H2: ImageVector? = null

