package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonWalking: ImageVector
    get() {
        if (_PersonWalking != null) return _PersonWalking!!
        
        _PersonWalking = ImageVector.Builder(
            name = "person-walking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                moveTo(6.44f, 3.752f)
                arcTo(0.75f, 0.75f, 0f, false, true, 7f, 3.5f)
                horizontalLineToRelative(1.445f)
                curveToRelative(0.742f, 0f, 1.32f, 0.643f, 1.243f, 1.38f)
                lineToRelative(-0.43f, 4.083f)
                arcToRelative(1.8f, 1.8f, 0f, false, true, -0.088f, 0.395f)
                lineToRelative(-0.318f, 0.906f)
                lineToRelative(0.213f, 0.242f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, 0.114f, 0.175f)
                lineToRelative(2f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.357f, 0.638f)
                lineToRelative(-1.956f, -4.154f)
                lineToRelative(-1.68f, -1.921f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 8.96f)
                lineToRelative(0.138f, -2.613f)
                lineToRelative(-0.435f, 0.489f)
                lineToRelative(-0.464f, 2.786f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.48f, -0.246f)
                lineToRelative(0.5f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.18f, -0.375f)
                lineToRelative(2f, -2.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.25f, 11.745f)
                verticalLineToRelative(-1.418f)
                lineToRelative(1.204f, 1.375f)
                lineToRelative(0.261f, 0.524f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.12f, 0.231f)
                lineToRelative(-2.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.19f, -0.914f)
                close()
                moveToRelative(4.22f, -4.215f)
                lineToRelative(-0.494f, -0.494f)
                lineToRelative(0.205f, -1.843f)
                lineToRelative(0.006f, -0.067f)
                lineToRelative(1.124f, 1.124f)
                horizontalLineToRelative(1.44f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(11f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.531f, -0.22f)
                close()
            }
        }.build()
        
        return _PersonWalking!!
    }

private var _PersonWalking: ImageVector? = null

