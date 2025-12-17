package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ServerStack: ImageVector
    get() {
        if (_ServerStack != null) return _ServerStack!!
        
        _ServerStack = ImageVector.Builder(
            name = "server-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.507f, 4.048f)
                arcTo(3f, 3f, 0f, false, true, 7.785f, 3f)
                horizontalLineToRelative(8.43f)
                arcToRelative(3f, 3f, 0f, false, true, 2.278f, 1.048f)
                lineToRelative(1.722f, 2.008f)
                arcTo(4.533f, 4.533f, 0f, false, false, 19.5f, 6f)
                horizontalLineToRelative(-15f)
                curveToRelative(-0.243f, 0f, -0.482f, 0.02f, -0.715f, 0.056f)
                lineToRelative(1.722f, -2.008f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 10.5f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(15f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, 6f)
                horizontalLineToRelative(-15f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                close()
                moveToRelative(15f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
                moveToRelative(2.25f, 0.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
                moveTo(4.5f, 15f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 6f)
                horizontalLineToRelative(15f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                horizontalLineToRelative(-15f)
                close()
                moveToRelative(11.25f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
                moveTo(19.5f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
            }
        }.build()
        
        return _ServerStack!!
    }

private var _ServerStack: ImageVector? = null

