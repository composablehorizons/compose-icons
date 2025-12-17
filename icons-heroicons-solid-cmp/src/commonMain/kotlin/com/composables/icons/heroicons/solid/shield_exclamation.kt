package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ShieldExclamation: ImageVector
    get() {
        if (_ShieldExclamation != null) return _ShieldExclamation!!
        
        _ShieldExclamation = ImageVector.Builder(
            name = "shield-exclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.484f, 2.17f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.032f, 0f)
                arcToRelative(11.209f, 11.209f, 0f, false, false, 7.877f, 3.08f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.722f, 0.515f)
                arcToRelative(12.74f, 12.74f, 0f, false, true, 0.635f, 3.985f)
                curveToRelative(0f, 5.942f, -4.064f, 10.933f, -9.563f, 12.348f)
                arcToRelative(0.749f, 0.749f, 0f, false, true, -0.374f, 0f)
                curveTo(6.314f, 20.683f, 2.25f, 15.692f, 2.25f, 9.75f)
                curveToRelative(0f, -1.39f, 0.223f, -2.73f, 0.635f, -3.985f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.722f, -0.516f)
                lineToRelative(0.143f, 0.001f)
                curveToRelative(2.996f, 0f, 5.718f, -1.17f, 7.734f, -3.08f)
                close()
                moveTo(12f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(12f, 15f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.008f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.008f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-0.008f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(12f)
                close()
            }
        }.build()
        
        return _ShieldExclamation!!
    }

private var _ShieldExclamation: ImageVector? = null

