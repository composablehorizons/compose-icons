package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Home: ImageVector
    get() {
        if (_Home != null) return _Home!!
        
        _Home = ImageVector.Builder(
            name = "home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.47f, 3.841f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(8.69f, 8.69f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.061f)
                lineToRelative(-8.689f, -8.69f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -3.182f, 0f)
                lineToRelative(-8.69f, 8.69f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.061f, 1.06f)
                lineToRelative(8.69f, -8.689f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 5.432f)
                lineToRelative(8.159f, 8.159f)
                curveToRelative(0.03f, 0.03f, 0.06f, 0.058f, 0.091f, 0.086f)
                verticalLineToRelative(6.198f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(5.625f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, -1.875f, -1.875f)
                verticalLineToRelative(-6.198f)
                arcToRelative(2.29f, 2.29f, 0f, false, false, 0.091f, -0.086f)
                lineTo(12f, 5.432f)
                close()
            }
        }.build()
        
        return _Home!!
    }

private var _Home: ImageVector? = null

