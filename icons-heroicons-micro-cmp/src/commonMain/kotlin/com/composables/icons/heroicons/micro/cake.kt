package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Cake: ImageVector
    get() {
        if (_Cake != null) return _Cake!!
        
        _Cake = ImageVector.Builder(
            name = "cake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.75f, 1f)
                lineToRelative(-0.884f, 0.884f)
                arcToRelative(1.25f, 1.25f, 0f, true, false, 1.768f, 0f)
                lineTo(4.75f, 1f)
                close()
                moveTo(11.25f, 1f)
                lineToRelative(-0.884f, 0.884f)
                arcToRelative(1.25f, 1.25f, 0f, true, false, 1.768f, 0f)
                lineTo(11.25f, 1f)
                close()
                moveTo(8.884f, 1.884f)
                lineTo(8f, 1f)
                lineToRelative(-0.884f, 0.884f)
                arcToRelative(1.25f, 1.25f, 0f, true, false, 1.768f, 0f)
                close()
                moveTo(4f, 7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(1.034f)
                curveToRelative(0.347f, 0f, 0.694f, -0.056f, 1.028f, -0.167f)
                lineToRelative(0.47f, -0.157f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, 3.004f, 0f)
                lineToRelative(0.47f, 0.157f)
                arcToRelative(3.25f, 3.25f, 0f, false, false, 2.056f, 0f)
                lineToRelative(0.47f, -0.157f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, 3.004f, 0f)
                lineToRelative(0.47f, 0.157f)
                curveToRelative(0.334f, 0.111f, 0.681f, 0.167f, 1.028f, 0.167f)
                verticalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                verticalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineTo(7f)
                horizontalLineTo(8.75f)
                verticalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineTo(7f)
                horizontalLineTo(5.5f)
                verticalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineTo(7f)
                close()
                moveTo(14f, 11.534f)
                arcToRelative(4.749f, 4.749f, 0f, false, true, -1.502f, -0.244f)
                lineToRelative(-0.47f, -0.157f)
                arcToRelative(3.25f, 3.25f, 0f, false, false, -2.056f, 0f)
                lineToRelative(-0.47f, 0.157f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -3.004f, 0f)
                lineToRelative(-0.47f, -0.157f)
                arcToRelative(3.25f, 3.25f, 0f, false, false, -2.056f, 0f)
                lineToRelative(-0.47f, 0.157f)
                arcTo(4.748f, 4.748f, 0f, false, true, 2f, 11.534f)
                verticalLineTo(13f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1.466f)
                close()
            }
        }.build()
        
        return _Cake!!
    }

private var _Cake: ImageVector? = null

