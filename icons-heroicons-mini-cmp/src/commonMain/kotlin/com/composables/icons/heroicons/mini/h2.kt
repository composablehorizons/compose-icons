package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.H2: ImageVector
    get() {
        if (_H2 != null) return _H2!!
        
        _H2 = ImageVector.Builder(
            name = "h2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.75f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(4.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2.75f, 4f)
                close()
                moveTo(15f, 9.5f)
                curveToRelative(-0.729f, 0f, -1.445f, 0.051f, -2.146f, 0.15f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.208f, -1.486f)
                arcToRelative(16.887f, 16.887f, 0f, false, true, 3.824f, -0.1f)
                curveToRelative(0.855f, 0.074f, 1.512f, 0.78f, 1.527f, 1.637f)
                arcToRelative(17.476f, 17.476f, 0f, false, true, -0.009f, 0.931f)
                arcToRelative(1.713f, 1.713f, 0f, false, true, -1.18f, 1.556f)
                lineToRelative(-2.453f, 0.818f)
                arcToRelative(1.25f, 1.25f, 0f, false, false, -0.855f, 1.185f)
                verticalLineToRelative(0.309f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-1.059f)
                arcToRelative(2.75f, 2.75f, 0f, false, true, 1.88f, -2.608f)
                lineToRelative(2.454f, -0.818f)
                curveToRelative(0.102f, -0.034f, 0.153f, -0.117f, 0.155f, -0.188f)
                arcToRelative(15.556f, 15.556f, 0f, false, false, 0.009f, -0.85f)
                arcToRelative(0.171f, 0.171f, 0f, false, false, -0.158f, -0.169f)
                arcTo(15.458f, 15.458f, 0f, false, false, 15f, 9.5f)
                close()
            }
        }.build()
        
        return _H2!!
    }

private var _H2: ImageVector? = null

