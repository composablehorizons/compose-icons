package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CloudDataConnection: ImageVector
    get() {
        if (_CloudDataConnection != null) return _CloudDataConnection!!
        
        _CloudDataConnection = ImageVector.Builder(
            name = "cloud-data-connection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.262f, 4.087f)
                curveToRelative(0.974f, 0.768f, 1.566f, 1.848f, 1.678f, 2.997f)
                lineToRelative(0.007f, 0.107f)
                lineToRelative(0.18f, 0.025f)
                arcToRelative(3.42f, 3.42f, 0f, false, true, 2.867f, 3.184f)
                lineToRelative(0.006f, 0.188f)
                arcToRelative(3.42f, 3.42f, 0f, false, true, -3.425f, 3.412f)
                horizontalLineToRelative(-3.575f)
                lineToRelative(0.001f, 1.171f)
                arcToRelative(3f, 3f, 0f, false, true, 1.829f, 1.829f)
                horizontalLineToRelative(6.17f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-6.17f)
                arcToRelative(3.001f, 3.001f, 0f, false, true, -5.66f, 0f)
                horizontalLineToRelative(-6.17f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(6.171f)
                arcToRelative(3f, 3f, 0f, false, true, 1.829f, -1.83f)
                verticalLineToRelative(-1.17f)
                horizontalLineToRelative(-2.74f)
                curveToRelative(-2.341f, 0f, -4.26f, -1.826f, -4.26f, -4.103f)
                curveToRelative(0f, -2.001f, 1.481f, -3.655f, 3.43f, -4.026f)
                lineToRelative(0.086f, -0.015f)
                lineToRelative(0.049f, -0.112f)
                curveToRelative(0.514f, -1.124f, 1.508f, -2.01f, 2.756f, -2.447f)
                lineToRelative(0.222f, -0.072f)
                curveToRelative(1.627f, -0.49f, 3.42f, -0.166f, 4.72f, 0.862f)
            }
        }.build()
        
        return _CloudDataConnection!!
    }

private var _CloudDataConnection: ImageVector? = null

