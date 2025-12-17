package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.GlobeCentralSouthAsia: ImageVector
    get() {
        if (_GlobeCentralSouthAsia != null) return _GlobeCentralSouthAsia!!
        
        _GlobeCentralSouthAsia = ImageVector.Builder(
            name = "globe-central-south-asia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(8f, 8f, 0f, true, false, 0f, 16f)
                arcTo(8f, 8f, 0f, false, false, 8f, 0f)
                moveTo(4.882f, 1.731f)
                arcToRelative(0.48f, 0.48f, 0f, false, false, 0.14f, 0.291f)
                arcToRelative(0.487f, 0.487f, 0f, false, true, -0.126f, 0.78f)
                lineToRelative(-0.291f, 0.146f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, -0.188f, 0.135f)
                lineToRelative(-0.48f, 0.48f)
                arcToRelative(1f, 1f, 0f, false, true, -1.023f, 0.242f)
                lineToRelative(-0.02f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.462f, -0.04f)
                arcToRelative(7f, 7f, 0f, false, true, 2.45f, -2.027f)
                moveToRelative(-3f, 9.674f)
                lineToRelative(0.86f, -0.216f)
                arcToRelative(1f, 1f, 0f, false, false, 0.758f, -0.97f)
                verticalLineToRelative(-0.184f)
                arcToRelative(1f, 1f, 0f, false, true, 0.445f, -0.832f)
                lineToRelative(0.04f, -0.026f)
                arcToRelative(1f, 1f, 0f, false, false, 0.152f, -1.54f)
                lineTo(3.121f, 6.621f)
                arcToRelative(0.414f, 0.414f, 0f, false, true, 0.542f, -0.624f)
                lineToRelative(1.09f, 0.818f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.523f, 0.047f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.724f, 0.447f)
                verticalLineToRelative(0.455f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.131f, 0.433f)
                lineToRelative(0.795f, 1.192f)
                arcToRelative(1f, 1f, 0f, false, true, 0.116f, 0.238f)
                lineToRelative(0.73f, 2.19f)
                arcToRelative(1f, 1f, 0f, false, false, 0.949f, 0.683f)
                horizontalLineToRelative(0.058f)
                arcToRelative(1f, 1f, 0f, false, false, 0.949f, -0.684f)
                lineToRelative(0.73f, -2.189f)
                arcToRelative(1f, 1f, 0f, false, true, 0.116f, -0.238f)
                lineToRelative(0.791f, -1.187f)
                arcTo(0.45f, 0.45f, 0f, false, true, 11.743f, 8f)
                curveToRelative(0.16f, 0f, 0.306f, 0.084f, 0.392f, 0.218f)
                curveToRelative(0.557f, 0.875f, 1.63f, 2.282f, 2.365f, 2.282f)
                lineToRelative(0.04f, -0.001f)
                arcToRelative(7.003f, 7.003f, 0f, false, true, -12.658f, 0.905f)
                close()
            }
        }.build()
        
        return _GlobeCentralSouthAsia!!
    }

private var _GlobeCentralSouthAsia: ImageVector? = null

