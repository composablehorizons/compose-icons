package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Envelope: ImageVector
    get() {
        if (_Envelope != null) return _Envelope!!
        
        _Envelope = ImageVector.Builder(
            name = "envelope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 64f)
                horizontalLineTo(48f)
                curveTo(21.49f, 64f, 0f, 85.49f, 0f, 112f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(112f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveToRelative(0f, 48f)
                verticalLineToRelative(40.805f)
                curveToRelative(-22.422f, 18.259f, -58.168f, 46.651f, -134.587f, 106.49f)
                curveToRelative(-16.841f, 13.247f, -50.201f, 45.072f, -73.413f, 44.701f)
                curveToRelative(-23.208f, 0.375f, -56.579f, -31.459f, -73.413f, -44.701f)
                curveTo(106.18f, 199.465f, 70.425f, 171.067f, 48f, 152.805f)
                verticalLineTo(112f)
                horizontalLineToRelative(416f)
                close()
                moveTo(48f, 400f)
                verticalLineTo(214.398f)
                curveToRelative(22.914f, 18.251f, 55.409f, 43.862f, 104.938f, 82.646f)
                curveToRelative(21.857f, 17.205f, 60.134f, 55.186f, 103.062f, 54.955f)
                curveToRelative(42.717f, 0.231f, 80.509f, -37.199f, 103.053f, -54.947f)
                curveToRelative(49.528f, -38.783f, 82.032f, -64.401f, 104.947f, -82.653f)
                verticalLineTo(400f)
                horizontalLineTo(48f)
                close()
            }
        }.build()
        
        return _Envelope!!
    }

private var _Envelope: ImageVector? = null

