package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.GlobeCentralSouthAsia: ImageVector
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
                arcToRelative(8f, 8f, 0f, true, true, 0f, 16f)
                arcTo(8f, 8f, 0f, false, true, 8f, 0f)
                moveToRelative(0f, 1f)
                arcToRelative(7f, 7f, 0f, false, false, -3.115f, 0.73f)
                arcToRelative(0.48f, 0.48f, 0f, false, false, 0.137f, 0.292f)
                arcToRelative(0.488f, 0.488f, 0f, false, true, -0.126f, 0.78f)
                lineToRelative(-0.292f, 0.145f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, -0.187f, 0.136f)
                lineToRelative(-0.48f, 0.48f)
                arcToRelative(1f, 1f, 0f, false, true, -1.023f, 0.242f)
                lineToRelative(-0.02f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.461f, -0.041f)
                arcTo(6.97f, 6.97f, 0f, false, false, 1f, 8f)
                arcToRelative(6.96f, 6.96f, 0f, false, false, 0.883f, 3.403f)
                lineToRelative(0.86f, -0.213f)
                curveToRelative(0.444f, -0.112f, 0.757f, -0.512f, 0.757f, -0.971f)
                verticalLineToRelative(-0.184f)
                arcToRelative(1f, 1f, 0f, false, true, 0.445f, -0.832f)
                lineToRelative(0.04f, -0.026f)
                arcToRelative(1f, 1f, 0f, false, false, 0.153f, -1.54f)
                lineTo(3.12f, 6.622f)
                arcToRelative(0.415f, 0.415f, 0f, false, true, 0.542f, -0.624f)
                lineToRelative(1.09f, 0.817f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.523f, 0.047f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 7.31f)
                verticalLineToRelative(0.455f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.13f, 0.432f)
                lineToRelative(0.796f, 1.193f)
                arcToRelative(1f, 1f, 0f, false, true, 0.116f, 0.238f)
                lineToRelative(0.73f, 2.19f)
                arcToRelative(1f, 1f, 0f, false, false, 0.949f, 0.683f)
                horizontalLineToRelative(0.058f)
                arcToRelative(1f, 1f, 0f, false, false, 0.949f, -0.684f)
                lineToRelative(0.73f, -2.189f)
                quadToRelative(0.042f, -0.127f, 0.116f, -0.238f)
                lineToRelative(0.791f, -1.187f)
                arcTo(0.45f, 0.45f, 0f, false, true, 11.743f, 8f)
                curveToRelative(0.16f, 0f, 0.306f, 0.083f, 0.392f, 0.218f)
                curveToRelative(0.557f, 0.875f, 1.63f, 2.282f, 2.365f, 2.282f)
                lineToRelative(0.04f, -0.003f)
                arcTo(7f, 7f, 0f, false, false, 8f, 1f)
            }
        }.build()
        
        return _GlobeCentralSouthAsia!!
    }

private var _GlobeCentralSouthAsia: ImageVector? = null

