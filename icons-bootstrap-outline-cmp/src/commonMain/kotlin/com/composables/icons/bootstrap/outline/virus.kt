package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Virus: ImageVector
    get() {
        if (_Virus != null) return _Virus!!
        
        _Virus = ImageVector.Builder(
            name = "virus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1.402f)
                curveToRelative(0f, 0.511f, 0.677f, 0.693f, 0.933f, 0.25f)
                lineToRelative(0.7f, -1.214f)
                arcToRelative(1f, 1f, 0f, false, true, 1.733f, 1f)
                lineToRelative(-0.701f, 1.214f)
                curveToRelative(-0.256f, 0.443f, 0.24f, 0.939f, 0.683f, 0.683f)
                lineToRelative(1.214f, -0.701f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1.732f)
                lineToRelative(-1.214f, 0.701f)
                curveToRelative(-0.443f, 0.256f, -0.262f, 0.933f, 0.25f, 0.933f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                horizontalLineToRelative(-1.402f)
                curveToRelative(-0.512f, 0f, -0.693f, 0.677f, -0.25f, 0.933f)
                lineToRelative(1.214f, 0.701f)
                arcToRelative(1f, 1f, 0f, true, true, -1f, 1.732f)
                lineToRelative(-1.214f, -0.7f)
                curveToRelative(-0.443f, -0.257f, -0.939f, 0.24f, -0.683f, 0.682f)
                lineToRelative(0.701f, 1.214f)
                arcToRelative(1f, 1f, 0f, true, true, -1.732f, 1f)
                lineToRelative(-0.701f, -1.214f)
                curveToRelative(-0.256f, -0.443f, -0.933f, -0.262f, -0.933f, 0.25f)
                verticalLineTo(15f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                verticalLineToRelative(-1.402f)
                curveToRelative(0f, -0.512f, -0.677f, -0.693f, -0.933f, -0.25f)
                lineToRelative(-0.701f, 1.214f)
                arcToRelative(1f, 1f, 0f, false, true, -1.732f, -1f)
                lineToRelative(0.7f, -1.214f)
                curveToRelative(0.257f, -0.443f, -0.24f, -0.939f, -0.682f, -0.683f)
                lineToRelative(-1.214f, 0.701f)
                arcToRelative(1f, 1f, 0f, true, true, -1f, -1.732f)
                lineToRelative(1.214f, -0.701f)
                curveToRelative(0.443f, -0.256f, 0.261f, -0.933f, -0.25f, -0.933f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                horizontalLineToRelative(1.402f)
                curveToRelative(0.511f, 0f, 0.693f, -0.677f, 0.25f, -0.933f)
                lineToRelative(-1.214f, -0.701f)
                arcToRelative(1f, 1f, 0f, true, true, 1f, -1.732f)
                lineToRelative(1.214f, 0.701f)
                curveToRelative(0.443f, 0.256f, 0.939f, -0.24f, 0.683f, -0.683f)
                lineToRelative(-0.701f, -1.214f)
                arcToRelative(1f, 1f, 0f, false, true, 1.732f, -1f)
                lineToRelative(0.701f, 1.214f)
                curveToRelative(0.256f, 0.443f, 0.933f, 0.261f, 0.933f, -0.25f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                moveToRelative(2f, 5f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                moveTo(6f, 7f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                moveToRelative(1f, 4f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                moveToRelative(5f, -3f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
            }
        }.build()
        
        return _Virus!!
    }

private var _Virus: ImageVector? = null

