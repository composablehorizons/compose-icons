package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Mail: ImageVector
    get() {
        if (_Mail != null) return _Mail!!
        
        _Mail = ImageVector.Builder(
            name = "mail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 7.535f)
                verticalLineToRelative(9.465f)
                arcToRelative(3f, 3f, 0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-9.465f)
                lineToRelative(9.445f, 6.297f)
                lineToRelative(0.116f, 0.066f)
                arcToRelative(1f, 1f, 0f, false, false, 0.878f, 0f)
                lineToRelative(0.116f, -0.066f)
                lineToRelative(9.445f, -6.297f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 4f)
                curveToRelative(1.08f, 0f, 2.027f, 0.57f, 2.555f, 1.427f)
                lineToRelative(-9.555f, 6.37f)
                lineToRelative(-9.555f, -6.37f)
                arcToRelative(2.999f, 2.999f, 0f, false, true, 2.354f, -1.42f)
                lineToRelative(0.201f, -0.007f)
                horizontalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Mail!!
    }

private var _Mail: ImageVector? = null

