package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FistRaised: ImageVector
    get() {
        if (_FistRaised != null) return _FistRaised!!
        
        _FistRaised = ImageVector.Builder(
            name = "fist-raised",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(255.98f, 160f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(146.93f)
                curveToRelative(5.02f, -1.78f, 10.34f, -2.93f, 15.97f, -2.93f)
                horizontalLineToRelative(48.03f)
                close()
                moveToRelative(128f, 95.99f)
                curveToRelative(-0.01f, -35.34f, -28.66f, -63.99f, -63.99f, -63.99f)
                horizontalLineTo(207.85f)
                curveToRelative(-8.78f, 0f, -15.9f, 7.07f, -15.9f, 15.85f)
                verticalLineToRelative(0.56f)
                curveToRelative(0f, 26.27f, 21.3f, 47.59f, 47.57f, 47.59f)
                horizontalLineToRelative(35.26f)
                curveToRelative(9.68f, 0f, 13.2f, 3.58f, 13.2f, 8f)
                verticalLineToRelative(16.2f)
                curveToRelative(0f, 4.29f, -3.59f, 7.78f, -7.88f, 8f)
                curveToRelative(-44.52f, 2.28f, -64.16f, 24.71f, -96.05f, 72.55f)
                lineToRelative(-6.31f, 9.47f)
                arcToRelative(7.994f, 7.994f, 0f, false, true, -11.09f, 2.22f)
                lineToRelative(-13.31f, -8.88f)
                arcToRelative(7.994f, 7.994f, 0f, false, true, -2.22f, -11.09f)
                lineToRelative(6.31f, -9.47f)
                curveToRelative(15.73f, -23.6f, 30.2f, -43.26f, 47.31f, -58.08f)
                curveToRelative(-17.27f, -5.51f, -31.4f, -18.12f, -38.87f, -34.45f)
                curveToRelative(-6.59f, 3.41f, -13.96f, 5.52f, -21.87f, 5.52f)
                horizontalLineToRelative(-32f)
                curveToRelative(-12.34f, 0f, -23.49f, -4.81f, -32f, -12.48f)
                curveTo(71.48f, 251.19f, 60.33f, 256f, 48f, 256f)
                horizontalLineTo(16f)
                curveToRelative(-5.64f, 0f, -10.97f, -1.15f, -16f, -2.95f)
                verticalLineToRelative(77.93f)
                curveToRelative(0f, 33.95f, 13.48f, 66.5f, 37.49f, 90.51f)
                lineTo(63.99f, 448f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(255.98f)
                verticalLineToRelative(-63.96f)
                lineToRelative(35.91f, -35.92f)
                arcTo(96.035f, 96.035f, 0f, false, false, 384f, 344.21f)
                lineToRelative(-0.02f, -88.22f)
                close()
                moveToRelative(-32.01f, -90.09f)
                verticalLineTo(48f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(112f)
                horizontalLineToRelative(32f)
                curveToRelative(11.28f, 0f, 21.94f, 2.31f, 32f, 5.9f)
                close()
                moveTo(16f, 224f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(80f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineTo(16f)
                curveTo(7.16f, 64f, 0f, 71.16f, 0f, 80f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                close()
                moveToRelative(95.99f, 0f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(48f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(160f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                close()
            }
        }.build()
        
        return _FistRaised!!
    }

private var _FistRaised: ImageVector? = null

