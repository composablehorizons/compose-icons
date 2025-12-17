package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Man: ImageVector
    get() {
        if (_Man != null) return _Man!!
        
        _Man = ImageVector.Builder(
            name = "man",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 8f)
                curveToRelative(1.628f, 0f, 3.2f, 0.787f, 4.707f, 2.293f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 1.414f)
                curveToRelative(-0.848f, -0.848f, -1.662f, -1.369f, -2.444f, -1.587f)
                lineToRelative(-0.849f, 5.944f)
                verticalLineToRelative(4.936f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-4.929f)
                lineToRelative(-0.85f, -5.951f)
                curveToRelative(-0.781f, 0.218f, -1.595f, 0.739f, -2.443f, 1.587f)
                arcToRelative(1f, 1f, 0f, true, true, -1.414f, -1.414f)
                curveToRelative(1.506f, -1.506f, 3.08f, -2.293f, 4.707f, -2.293f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                arcToRelative(3f, 3f, 0f, true, true, -3f, 3f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, -2.824f)
            }
        }.build()
        
        return _Man!!
    }

private var _Man: ImageVector? = null

