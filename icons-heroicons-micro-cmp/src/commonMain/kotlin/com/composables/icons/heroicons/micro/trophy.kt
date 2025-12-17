package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Trophy: ImageVector
    get() {
        if (_Trophy != null) return _Trophy!!
        
        _Trophy = ImageVector.Builder(
            name = "trophy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1.69f)
                arcToRelative(0.494f, 0.494f, 0f, false, false, -0.438f, -0.494f)
                arcToRelative(32.352f, 32.352f, 0f, false, false, -7.124f, 0f)
                arcTo(0.494f, 0.494f, 0f, false, false, 4f, 1.689f)
                verticalLineToRelative(0.567f)
                curveToRelative(-0.811f, 0.104f, -1.612f, 0.24f, -2.403f, 0.406f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.595f, 0.714f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 4.35f, 4.622f)
                arcTo(3.99f, 3.99f, 0f, false, false, 7f, 8.874f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.667f)
                curveTo(3.597f, 13f, 3f, 13.597f, 3f, 14.333f)
                curveToRelative(0f, 0.368f, 0.298f, 0.667f, 0.667f, 0.667f)
                horizontalLineToRelative(8.666f)
                arcToRelative(0.667f, 0.667f, 0f, false, false, 0.667f, -0.667f)
                curveToRelative(0f, -0.736f, -0.597f, -1.333f, -1.333f, -1.333f)
                horizontalLineTo(11f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(9f)
                verticalLineTo(8.874f)
                arcToRelative(3.99f, 3.99f, 0f, false, false, 1.649f, -0.876f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 4.35f, -4.622f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.596f, -0.714f)
                arcTo(30.897f, 30.897f, 0f, false, false, 12f, 2.256f)
                verticalLineToRelative(-0.567f)
                close()
                moveTo(4f, 3.768f)
                curveToRelative(-0.49f, 0.066f, -0.976f, 0.145f, -1.458f, 0.235f)
                arcToRelative(3.004f, 3.004f, 0f, false, false, 1.64f, 2.192f)
                arcTo(3.999f, 3.999f, 0f, false, true, 4f, 5f)
                verticalLineTo(3.769f)
                close()
                moveToRelative(8f, 0f)
                curveToRelative(0.49f, 0.066f, 0.976f, 0.145f, 1.458f, 0.235f)
                arcToRelative(3.004f, 3.004f, 0f, false, true, -1.64f, 2.192f)
                curveTo(11.936f, 5.818f, 12f, 5.416f, 12f, 5f)
                verticalLineTo(3.769f)
                close()
            }
        }.build()
        
        return _Trophy!!
    }

private var _Trophy: ImageVector? = null

