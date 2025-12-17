package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BellPlus: ImageVector
    get() {
        if (_BellPlus != null) return _BellPlus!!
        
        _BellPlus = ImageVector.Builder(
            name = "bell-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.235f, 19f)
                curveToRelative(0.865f, 0f, 1.322f, 1.024f, 0.745f, 1.668f)
                arcToRelative(3.992f, 3.992f, 0f, false, true, -2.98f, 1.332f)
                arcToRelative(3.992f, 3.992f, 0f, false, true, -2.98f, -1.332f)
                curveToRelative(-0.552f, -0.616f, -0.158f, -1.579f, 0.634f, -1.661f)
                lineToRelative(0.11f, -0.006f)
                horizontalLineToRelative(4.471f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(1.358f, 0f, 2.506f, 0.903f, 2.875f, 2.141f)
                lineToRelative(0.046f, 0.171f)
                lineToRelative(0.008f, 0.043f)
                arcToRelative(8.013f, 8.013f, 0f, false, true, 4.024f, 6.069f)
                lineToRelative(0.028f, 0.287f)
                lineToRelative(0.019f, 0.289f)
                verticalLineToRelative(2.931f)
                lineToRelative(0.021f, 0.136f)
                arcToRelative(3f, 3f, 0f, false, false, 1.143f, 1.847f)
                lineToRelative(0.167f, 0.117f)
                lineToRelative(0.162f, 0.099f)
                curveToRelative(0.86f, 0.487f, 0.56f, 1.766f, -0.377f, 1.864f)
                lineToRelative(-0.116f, 0.006f)
                horizontalLineToRelative(-16f)
                curveToRelative(-1.028f, 0f, -1.387f, -1.364f, -0.493f, -1.87f)
                arcToRelative(3f, 3f, 0f, false, false, 1.472f, -2.063f)
                lineToRelative(0.021f, -0.143f)
                lineToRelative(0.001f, -2.97f)
                arcToRelative(8f, 8f, 0f, false, true, 3.821f, -6.454f)
                lineToRelative(0.248f, -0.146f)
                lineToRelative(0.01f, -0.043f)
                arcToRelative(3.003f, 3.003f, 0f, false, true, 2.562f, -2.29f)
                lineToRelative(0.182f, -0.017f)
                lineToRelative(0.176f, -0.004f)
                close()
                moveToRelative(0f, 6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.117f, 1.993f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
            }
        }.build()
        
        return _BellPlus!!
    }

private var _BellPlus: ImageVector? = null

