package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Globe2: ImageVector
    get() {
        if (_Globe2 != null) return _Globe2!!
        
        _Globe2 = ImageVector.Builder(
            name = "globe2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 8f)
                arcToRelative(8f, 8f, 0f, true, true, 16f, 0f)
                arcTo(8f, 8f, 0f, false, true, 0f, 8f)
                moveToRelative(7.5f, -6.923f)
                curveToRelative(-0.67f, 0.204f, -1.335f, 0.82f, -1.887f, 1.855f)
                quadToRelative(-0.215f, 0.403f, -0.395f, 0.872f)
                curveToRelative(0.705f, 0.157f, 1.472f, 0.257f, 2.282f, 0.287f)
                close()
                moveTo(4.249f, 3.539f)
                quadToRelative(0.214f, -0.577f, 0.481f, -1.078f)
                arcToRelative(7f, 7f, 0f, false, true, 0.597f, -0.933f)
                arcTo(7f, 7f, 0f, false, false, 3.051f, 3.05f)
                quadToRelative(0.544f, 0.277f, 1.198f, 0.49f)
                close()
                moveTo(3.509f, 7.5f)
                curveToRelative(0.036f, -1.07f, 0.188f, -2.087f, 0.436f, -3.008f)
                arcToRelative(9f, 9f, 0f, false, true, -1.565f, -0.667f)
                arcTo(6.96f, 6.96f, 0f, false, false, 1.018f, 7.5f)
                close()
                moveToRelative(1.4f, -2.741f)
                arcToRelative(12.3f, 12.3f, 0f, false, false, -0.4f, 2.741f)
                horizontalLineTo(7.5f)
                verticalLineTo(5.091f)
                curveToRelative(-0.91f, -0.03f, -1.783f, -0.145f, -2.591f, -0.332f)
                moveTo(8.5f, 5.09f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(2.99f)
                arcToRelative(12.3f, 12.3f, 0f, false, false, -0.399f, -2.741f)
                curveToRelative(-0.808f, 0.187f, -1.681f, 0.301f, -2.591f, 0.332f)
                close()
                moveTo(4.51f, 8.5f)
                curveToRelative(0.035f, 0.987f, 0.176f, 1.914f, 0.399f, 2.741f)
                arcTo(13.6f, 13.6f, 0f, false, true, 7.5f, 10.91f)
                verticalLineTo(8.5f)
                close()
                moveToRelative(3.99f, 0f)
                verticalLineToRelative(2.409f)
                curveToRelative(0.91f, 0.03f, 1.783f, 0.145f, 2.591f, 0.332f)
                curveToRelative(0.223f, -0.827f, 0.364f, -1.754f, 0.4f, -2.741f)
                close()
                moveToRelative(-3.282f, 3.696f)
                quadToRelative(0.18f, 0.469f, 0.395f, 0.872f)
                curveToRelative(0.552f, 1.035f, 1.218f, 1.65f, 1.887f, 1.855f)
                verticalLineTo(11.91f)
                curveToRelative(-0.81f, 0.03f, -1.577f, 0.13f, -2.282f, 0.287f)
                close()
                moveToRelative(0.11f, 2.276f)
                arcToRelative(7f, 7f, 0f, false, true, -0.598f, -0.933f)
                arcToRelative(9f, 9f, 0f, false, true, -0.481f, -1.079f)
                arcToRelative(8.4f, 8.4f, 0f, false, false, -1.198f, 0.49f)
                arcToRelative(7f, 7f, 0f, false, false, 2.276f, 1.522f)
                close()
                moveToRelative(-1.383f, -2.964f)
                arcTo(13.4f, 13.4f, 0f, false, true, 3.508f, 8.5f)
                horizontalLineToRelative(-2.49f)
                arcToRelative(6.96f, 6.96f, 0f, false, false, 1.362f, 3.675f)
                curveToRelative(0.47f, -0.258f, 0.995f, -0.482f, 1.565f, -0.667f)
                moveToRelative(6.728f, 2.964f)
                arcToRelative(7f, 7f, 0f, false, false, 2.275f, -1.521f)
                arcToRelative(8.4f, 8.4f, 0f, false, false, -1.197f, -0.49f)
                arcToRelative(9f, 9f, 0f, false, true, -0.481f, 1.078f)
                arcToRelative(7f, 7f, 0f, false, true, -0.597f, 0.933f)
                moveTo(8.5f, 11.909f)
                verticalLineToRelative(3.014f)
                curveToRelative(0.67f, -0.204f, 1.335f, -0.82f, 1.887f, -1.855f)
                quadToRelative(0.216f, -0.403f, 0.395f, -0.872f)
                arcTo(12.6f, 12.6f, 0f, false, false, 8.5f, 11.91f)
                close()
                moveToRelative(3.555f, -0.401f)
                curveToRelative(0.57f, 0.185f, 1.095f, 0.409f, 1.565f, 0.667f)
                arcTo(6.96f, 6.96f, 0f, false, false, 14.982f, 8.5f)
                horizontalLineToRelative(-2.49f)
                arcToRelative(13.4f, 13.4f, 0f, false, true, -0.437f, 3.008f)
                moveTo(14.982f, 7.5f)
                arcToRelative(6.96f, 6.96f, 0f, false, false, -1.362f, -3.675f)
                curveToRelative(-0.47f, 0.258f, -0.995f, 0.482f, -1.565f, 0.667f)
                curveToRelative(0.248f, 0.92f, 0.4f, 1.938f, 0.437f, 3.008f)
                close()
                moveTo(11.27f, 2.461f)
                quadToRelative(0.266f, 0.502f, 0.482f, 1.078f)
                arcToRelative(8.4f, 8.4f, 0f, false, false, 1.196f, -0.49f)
                arcToRelative(7f, 7f, 0f, false, false, -2.275f, -1.52f)
                curveToRelative(0.218f, 0.283f, 0.418f, 0.597f, 0.597f, 0.932f)
                moveToRelative(-0.488f, 1.343f)
                arcToRelative(8f, 8f, 0f, false, false, -0.395f, -0.872f)
                curveTo(9.835f, 1.897f, 9.17f, 1.282f, 8.5f, 1.077f)
                verticalLineTo(4.09f)
                curveToRelative(0.81f, -0.03f, 1.577f, -0.13f, 2.282f, -0.287f)
                close()
            }
        }.build()
        
        return _Globe2!!
    }

private var _Globe2: ImageVector? = null

