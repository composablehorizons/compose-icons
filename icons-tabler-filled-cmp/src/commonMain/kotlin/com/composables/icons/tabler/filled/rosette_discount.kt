package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.RosetteDiscount: ImageVector
    get() {
        if (_RosetteDiscount != null) return _RosetteDiscount!!
        
        _RosetteDiscount = ImageVector.Builder(
            name = "rosette-discount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.01f, 2.011f)
                curveToRelative(0.852f, 0f, 1.668f, 0.34f, 2.267f, 0.942f)
                lineToRelative(0.698f, 0.698f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, 0.845f, 0.349f)
                horizontalLineToRelative(1f)
                arcToRelative(3.2f, 3.2f, 0f, false, true, 3.2f, 3.2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.316f, 0.126f, 0.62f, 0.347f, 0.843f)
                lineToRelative(0.698f, 0.698f)
                arcToRelative(3.2f, 3.2f, 0f, false, true, 0.002f, 4.536f)
                lineToRelative(-0.698f, 0.698f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.349f, 0.845f)
                verticalLineToRelative(1f)
                arcToRelative(3.2f, 3.2f, 0f, false, true, -3.2f, 3.2f)
                horizontalLineToRelative(-1f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.843f, 0.347f)
                lineToRelative(-0.698f, 0.698f)
                arcToRelative(3.2f, 3.2f, 0f, false, true, -4.536f, 0.002f)
                lineToRelative(-0.698f, -0.698f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.845f, -0.349f)
                horizontalLineToRelative(-1f)
                arcToRelative(3.2f, 3.2f, 0f, false, true, -3.2f, -3.2f)
                verticalLineToRelative(-1f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.347f, -0.843f)
                lineToRelative(-0.698f, -0.698f)
                arcToRelative(3.2f, 3.2f, 0f, false, true, -0.002f, -4.536f)
                lineToRelative(0.698f, -0.698f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, 0.349f, -0.845f)
                verticalLineToRelative(-1f)
                lineToRelative(0.005f, -0.182f)
                arcToRelative(3.2f, 3.2f, 0f, false, true, 3.195f, -3.018f)
                horizontalLineToRelative(1f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, 0.843f, -0.347f)
                lineToRelative(0.698f, -0.698f)
                arcToRelative(3.2f, 3.2f, 0f, false, true, 2.269f, -0.944f)
                moveToRelative(2.49f, 10.989f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
                moveToRelative(1.207f, -4.707f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-6f, 6f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 1.414f)
                lineToRelative(6f, -6f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                moveToRelative(-6.207f, -0.293f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
            }
        }.build()
        
        return _RosetteDiscount!!
    }

private var _RosetteDiscount: ImageVector? = null

