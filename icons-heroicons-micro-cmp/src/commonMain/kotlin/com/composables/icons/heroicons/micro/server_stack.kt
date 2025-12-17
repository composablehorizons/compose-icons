package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ServerStack: ImageVector
    get() {
        if (_ServerStack != null) return _ServerStack!!
        
        _ServerStack = ImageVector.Builder(
            name = "server-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.354f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -1.857f, 1.257f)
                lineToRelative(-0.338f, 0.845f)
                curveTo(3.43f, 4.035f, 3.71f, 4f, 4f, 4f)
                horizontalLineToRelative(8f)
                curveToRelative(0.29f, 0f, 0.571f, 0.035f, 0.84f, 0.102f)
                lineToRelative(-0.337f, -0.845f)
                arcTo(2f, 2f, 0f, false, false, 10.646f, 2f)
                horizontalLineTo(5.354f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 13f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(10.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
                moveTo(9f, 13.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
                moveTo(4f, 5.5f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                horizontalLineTo(4f)
                close()
                moveToRelative(8f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
                moveTo(9.75f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
            }
        }.build()
        
        return _ServerStack!!
    }

private var _ServerStack: ImageVector? = null

