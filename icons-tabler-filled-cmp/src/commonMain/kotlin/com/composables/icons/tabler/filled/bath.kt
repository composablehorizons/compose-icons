package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Bath: ImageVector
    get() {
        if (_Bath != null) return _Bath!!
        
        _Bath = ImageVector.Builder(
            name = "bath",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(2.25f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(13f)
                arcToRelative(2f, 2f, 0f, false, true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.475f, -0.638f, 2.8f, -1.654f, 3.715f)
                lineToRelative(0.486f, 0.73f)
                arcToRelative(1f, 1f, 0f, false, true, -1.594f, 1.203f)
                lineToRelative(-0.07f, -0.093f)
                lineToRelative(-0.55f, -0.823f)
                arcToRelative(4.98f, 4.98f, 0f, false, true, -1.337f, 0.26f)
                lineToRelative(-0.281f, 0.008f)
                horizontalLineToRelative(-10f)
                arcToRelative(4.994f, 4.994f, 0f, false, true, -1.619f, -0.268f)
                lineToRelative(-0.549f, 0.823f)
                arcToRelative(1f, 1f, 0f, false, true, -1.723f, -1.009f)
                lineToRelative(0.059f, -0.1f)
                lineToRelative(0.486f, -0.73f)
                arcToRelative(4.987f, 4.987f, 0f, false, true, -1.647f, -3.457f)
                lineToRelative(-0.007f, -0.259f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Bath!!
    }

private var _Bath: ImageVector? = null

