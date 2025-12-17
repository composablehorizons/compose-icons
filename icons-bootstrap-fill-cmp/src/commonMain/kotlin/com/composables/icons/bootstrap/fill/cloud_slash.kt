package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CloudSlash: ImageVector
    get() {
        if (_CloudSlash != null) return _CloudSlash!!
        
        _CloudSlash = ImageVector.Builder(
            name = "cloud-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.112f, 5.112f)
                arcToRelative(3f, 3f, 0f, false, false, -0.17f, 0.613f)
                curveTo(1.266f, 6.095f, 0f, 7.555f, 0f, 9.318f)
                curveTo(0f, 11.366f, 1.708f, 13f, 3.781f, 13f)
                horizontalLineTo(11f)
                close()
                moveToRelative(11.372f, 7.372f)
                lineTo(4.937f, 2.937f)
                arcTo(5.5f, 5.5f, 0f, false, true, 8f, 2f)
                curveToRelative(2.69f, 0f, 4.923f, 2f, 5.166f, 4.579f)
                curveTo(14.758f, 6.804f, 16f, 8.137f, 16f, 9.773f)
                arcToRelative(3.2f, 3.2f, 0f, false, true, -1.516f, 2.711f)
                moveToRelative(-0.838f, 1.87f)
                lineToRelative(-12f, -12f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(12f, 12f)
                close()
            }
        }.build()
        
        return _CloudSlash!!
    }

private var _CloudSlash: ImageVector? = null

